package com.example.businessfranchisebackend.cotroller;

import com.example.businessfranchisebackend.exception.UserNotFoundException;
import com.example.businessfranchisebackend.model.Franchise;
import com.example.businessfranchisebackend.repository.FranchiseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:8080")
public class FranchiseController {

    @Autowired
    private FranchiseRepository franchiseRepository;

    @GetMapping("/franchiseList")
    List<Franchise> getAllFranchises(){
        return franchiseRepository.findAll();}

    @GetMapping("/franchiseList/{id}")
    Franchise getFranchiseById(@PathVariable Long id){
        return franchiseRepository.findById(id)
                .orElseThrow(()->new UserNotFoundException(id));
    }
}
