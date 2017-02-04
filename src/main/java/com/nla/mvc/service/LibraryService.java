package com.nla.mvc.service;

import java.util.List;

import com.nla.mvc.dto.BookDto;
import com.nla.mvc.dto.PersonDto;

public interface LibraryService {
	List<BookDto> findBookByPersonId(Integer id);

	List<PersonDto> findAllPersons();

	BookDto findBookById(Integer id);

	List<BookDto> findAllBooks();

	PersonDto findPersonById(Integer id);
}
