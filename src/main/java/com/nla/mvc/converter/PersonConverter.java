package com.nla.mvc.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nla.mvc.dto.BookDto;
import com.nla.mvc.dto.PersonDto;
import com.nla.mvc.entity.Book;
import com.nla.mvc.entity.Person;

/**
 * Converts entity to DTO
 */
@Component
public class PersonConverter {
	
	@Autowired
	private BookConverter converter;
	
	/**
	 * Convert the Person entity to Person DTO
	 * @param entity
	 * @return
	 */	
	public PersonDto convert(Person entity){
		return convert(entity, false);
	}
	
	public PersonDto convert(Person entity, boolean noBookList){
		ArrayList<BookDto> books = new ArrayList<BookDto>();
		PersonDto dto = new PersonDto(entity.getId()); 
		dto.setName(entity.getName());
		dto.setEmail(entity.getEmail());
		dto.setPhone(entity.getPhone());

		if(!noBookList){
			for(Book book: entity.getBooks()){
				books.add(converter.convert(book));
			}
		}
		dto.setBooks(books);
		
		return dto;
	}
	
	public List<PersonDto> convert(List<Person> entities){
		List<PersonDto> dtos = new ArrayList<PersonDto>();
		
		for(Person entity: entities){
			dtos.add(convert(entity, false));
		}
		
		return dtos;
	}
}