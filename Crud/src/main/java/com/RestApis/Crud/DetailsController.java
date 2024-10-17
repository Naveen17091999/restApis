package com.RestApis.Crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/details")
public class DetailsController {

    @Autowired
    public DetailsService service;

    @GetMapping
    public List<Details> getAllDetails(){
        return service.getAllDetails();
    }

    @PostMapping
    public String saveDetail(@RequestBody Details details){
        repository.save(details);
        return "Detail saved successfully....";
    }

    @PostMapping("/bulkDetails")
    public String savaAllDetails(@RequestBody List<Details> details){
        repository.saveAll(details);
        return "All details saved successfully...";
    }

    @GetMapping("/{id}")
    public Optional<Details> getById(@PathVariable long id){
        return repository.findById(id);
    }

    @PutMapping
    public String updateDetail(@RequestBody Details details){
        Optional<Details> exist = repository.findById(details.getId());
        if(exist.isPresent()){
            repository.save(details);
            return "Detail updated successfully";
        }
        return "Detail does not exist...";

        
    }

    @DeleteMapping("/{id}")
    public String deleteDetail(@PathVariable long id){
        repository.deleteById(id);
        return "Detail deleted successfully....";
    }
}
