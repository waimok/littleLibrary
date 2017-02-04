package com.nla.mvc.dto;

import java.io.Serializable;

public class BookDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String title;

    private String author;

    private String isbn;
    
	private PersonDto person;        
    
	public BookDto(Integer id){
		this.id = id;
	}
	
    public PersonDto getPerson() {
		return person;
	}

	public void setPerson(PersonDto person) {
		this.person = person;
	}

	public Integer getId() {
		return id;
	}
    
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
}
