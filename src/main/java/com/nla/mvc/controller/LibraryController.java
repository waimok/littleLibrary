package com.nla.mvc.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nla.mvc.dto.BookDto;
import com.nla.mvc.dto.PersonDto;
import com.nla.mvc.service.LibraryService;

@Controller
public class LibraryController {
    protected static final int DEFAULT_PAGE_NUM = 0;
    protected static final int DEFAULT_PAGE_SIZE = 5;

    @Autowired
    protected LibraryService libraryService;

    protected static final Logger LOGGER = LoggerFactory
            .getLogger(LibraryController.class);

    @RequestMapping(value = "/personlist")
    public String getAllPersonList(Model model) {
        List<PersonDto> persons = libraryService.findAllPersons();
        model.addAttribute("persons", persons);
        return "/jsp/personlist";
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
    public String getBookById(@PathVariable("id") Integer id, Model model) {
        BookDto book = libraryService.findBookById(id);
        model.addAttribute("book", book);
        return "/jsp/book";
    } 
    
    @RequestMapping(value = "/booklist")
    public String getAllBookList(Model model) {
        List<BookDto> books = libraryService.findAllBooks();
        model.addAttribute("books", books);
        return "/jsp/booklist";
    }

    @RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
    public String getPersonById(@PathVariable("id") Integer id, Model model) {
        PersonDto person = libraryService.findPersonById(id);
        model.addAttribute("person", person);
        return "/jsp/person";
    }     
}
