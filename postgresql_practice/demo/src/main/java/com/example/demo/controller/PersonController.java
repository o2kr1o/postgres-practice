package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class PersonController {

  @Autowired
  PersonService service;
  
  @GetMapping("/person")
  public String index(Model model) {
      List<Person> personList = service.findAll();
      model.addAttribute("personList", personList);
      return "person/index";
  }
}