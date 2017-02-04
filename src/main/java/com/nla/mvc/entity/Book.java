package com.nla.mvc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_BOOK")
public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "BOOK_ID")
    @GeneratedValue
    private Integer id;

    @Column(name = "TITLE")
    @Size(min = 1, max = 30)
    private String title;

    @Column(name = "AUTHOR")
    @Size(min = 1, max = 30)
    private String author;

    @Column(name = "ISBN")
    @Size(min = 1, max = 30)
    private String isbn;
    
    @ManyToOne
	private Person person;        
    
    public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
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
