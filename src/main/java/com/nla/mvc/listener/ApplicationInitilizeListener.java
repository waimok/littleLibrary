package com.nla.mvc.listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.nla.mvc.entity.Book;
import com.nla.mvc.entity.Person;
import com.nla.mvc.repository.BookRepository;
import com.nla.mvc.repository.PersonRepository;

public class ApplicationInitilizeListener implements ServletContextListener {
    private static final Logger LOGGER = LoggerFactory
            .getLogger(ApplicationInitilizeListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        LOGGER.debug("initializing..");
        WebApplicationContext ctx = WebApplicationContextUtils
                .getWebApplicationContext(sce.getServletContext());
        PersonRepository personRepository = ctx.getBean(PersonRepository.class);
        personRepository.deleteAll();
        List<Person> persons = new ArrayList<Person>();

        // init data
        int itemCount = 10;        
        for (int i = 1; i <= itemCount; i++) {        	
        	
            Person p = new Person();
            p.setEmail("email" + i);
            p.setName("name" + i);
            int phone = 60000000 + i;
            p.setPhone("" + phone);
            persons.add(p);      
        }
        personRepository.save(persons);     
        
        BookRepository bookRepository = ctx.getBean(BookRepository.class);
        bookRepository.deleteAll();        
        List<Book> books = new ArrayList<Book>();
        Person p = personRepository.findOne(1);
        for (int i = 1; i <= itemCount; i++) {        	
        	if(i % 3 == 0){
        		p = personRepository.findOne(i);
        	}
        	
	        Book b = new Book();
	    	b.setAuthor("author" + i);
	    	b.setTitle("title" + i);
	    	b.setIsbn("isbn" + i);
	    	if(p != null){
	    		b.setPerson(p);
	    	}
	    	books.add(b);
        }
        bookRepository.save(books);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }

}
