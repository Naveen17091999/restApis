package com.RestApis.Crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailsService {
    @Autowired DetailsRepository repository;


    public List<Details> getAllDetails(){
        return repository.findAll();
    }
}
