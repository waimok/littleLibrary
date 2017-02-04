package com.nla.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nla.mvc.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
