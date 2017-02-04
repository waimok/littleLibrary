package com.nla.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nla.mvc.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
