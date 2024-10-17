package com.RestApis.One2One.RelationShip.controllers;

import com.RestApis.One2One.RelationShip.models.Person;
import com.RestApis.One2One.RelationShip.repositories.PersonRepository;
import com.RestApis.One2One.RelationShip.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    public PersonService service;

    @GetMapping
    public List<Person> getAll(){
        return service.getAllPersons();
    }

    @PostMapping
    public String save(@RequestBody Person person){
        return service.insertPerson(person);
    }
}
