package com.nla.mvc.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nla.mvc.dto.BookDto;
import com.nla.mvc.entity.Book;

/**
 * Converts entity to DTO
 */
@Component
public class BookConverter {
	
	@Autowired
	private PersonConverter personConverter;
		
	/**
	 * Convert a Book entity to Book DTO without the person linked to the Book entity
	 * @param entity
	 * @return
	 */
	public BookDto convert(Book entity){
		BookDto dto = new BookDto(entity.getId());
		
		dto.setAuthor(entity.getAuthor());
		dto.setIsbn(entity.getIsbn());
		dto.setTitle(entity.getTitle());
		dto.setPerson(personConverter.convert(entity.getPerson(), true));
		
		return dto;
	}
	
	public List<BookDto> convert(List<Book> entities){
		List<BookDto> dtos = new ArrayList<BookDto>();
		
		for(Book entity: entities){
			dtos.add(convert(entity));
		}
		
		return dtos;
	}

}