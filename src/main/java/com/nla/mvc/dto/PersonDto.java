package com.nla.mvc.dto;

import java.io.Serializable;
import java.util.List;

public class PersonDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String phone;
    
    private String email;
    
 	private List<BookDto> books;    
    
 	public PersonDto(Integer id){
 		this.id = id;
 	}
 	
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<BookDto> getBooks() {
		return books;
	}

	public void setBooks(List<BookDto> books) {
		this.books = books;
	}
}
