package com.nla.mvc.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_PERSON")
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "PERSON_ID")
    @GeneratedValue
    private Integer id;

    @Column(name = "PERSON_NAME")
    @Size(min = 1, max = 30)
    private String name;

    @Column(name = "PHONE")
    @Size(min = 1, max = 30)
    private String phone;
    
    @Column(name = "EMAIL")
    @Size(min = 1, max = 30)
    private String email;
    
    @OneToMany(mappedBy = "person")
	private List<Book> books;    
    
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
	
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
}
