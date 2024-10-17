package com.RestApis.One2One.RelationShip.services;

import com.RestApis.One2One.RelationShip.models.Person;
import com.RestApis.One2One.RelationShip.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    public PersonRepository repository;

    public List<Person> getAllPersons(){
        return repository.findAll();
    }

    public String insertPerson(Person person){
        repository.save(person);
        return "Person saved successfully...";
    }
}
