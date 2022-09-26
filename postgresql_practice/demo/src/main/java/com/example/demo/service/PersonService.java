package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class PersonService {

  @Autowired
  PersonRepository repository;

  public List<Person> findAll(){
    return repository.findAll();
  } 
}
