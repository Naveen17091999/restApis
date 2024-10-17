package com.RestApis.One2One.RelationShip.services;

import com.RestApis.One2One.RelationShip.models.Address;
import com.RestApis.One2One.RelationShip.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    public AddressRepository repository;

    public List<Address> getAllAddress(){
        return repository.findAll();
    }

    public String insertNewAddress(Address address){
        repository.save(address);
        return "Address saved successfully...";
    }

}
