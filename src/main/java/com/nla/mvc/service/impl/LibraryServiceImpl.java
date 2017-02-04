package com.nla.mvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nla.mvc.converter.BookConverter;
import com.nla.mvc.converter.PersonConverter;
import com.nla.mvc.dto.BookDto;
import com.nla.mvc.dto.PersonDto;
import com.nla.mvc.entity.Book;
import com.nla.mvc.entity.Person;
import com.nla.mvc.repository.BookRepository;
import com.nla.mvc.repository.PersonRepository;
import com.nla.mvc.service.LibraryService;

@Service
public class LibraryServiceImpl implements LibraryService {
	@Autowired
    protected PersonRepository personRepository;
  
    @Autowired
    protected BookRepository bookRepository;
    
    @Autowired
	private PersonConverter personConverter;
    
    @Autowired
	private BookConverter bookConverter;
    
    @Override
    @Transactional(readOnly = true)
    public List<BookDto> findBookByPersonId(Integer id) {
        Person person = personRepository.findOne(id);
        return bookConverter.convert(person.getBooks());
    }  

    @Override
    @Transactional(readOnly = true)
    public List<PersonDto> findAllPersons() {        
        List<Person> persons = personRepository.findAll();
        return personConverter.convert(persons);
    }
        
    @Override
    @Transactional(readOnly = true)
    public BookDto findBookById(Integer id) {
    	Book book = bookRepository.findOne(id);
        return bookConverter.convert(book);
    }  
    
    @Override
    @Transactional(readOnly = true)
    public List<BookDto> findAllBooks() {        
        List<Book> books = bookRepository.findAll();
        return bookConverter.convert(books);
    }
    
    @Override
    @Transactional(readOnly = true)
    public PersonDto findPersonById(Integer id) {
    	Person person = personRepository.findOne(id);
        return personConverter.convert(person);
    }      
}
