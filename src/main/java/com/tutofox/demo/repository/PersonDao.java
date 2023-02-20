package com.tutofox.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutofox.demo.entity.Person;

public interface PersonDao extends JpaRepository<Person, Long> {

}
