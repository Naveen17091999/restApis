package com.RestApis.One2One.RelationShip.controllers;

import com.RestApis.One2One.RelationShip.models.Address;
import com.RestApis.One2One.RelationShip.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    public AddressService service;

    @GetMapping
    public List<Address> getAll(){
        return service.getAllAddress();
    }

    @PostMapping
    public String save(@RequestBody Address address){
        return service.insertNewAddress(address);
    }
}
