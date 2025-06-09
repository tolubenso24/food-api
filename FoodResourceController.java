package com.example.foodapi.controller;

import com.example.foodapi.model.FoodResource;
import com.example.foodapi.repository.FoodResourceRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resources")
public class FoodResourceController {

    private final FoodResourceRepository repository;

    public FoodResourceController(FoodResourceRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<FoodResource> getAllResources() {
        return repository.findAll();
    }

    @PostMapping
    public FoodResource addResource(@RequestBody FoodResource resource) {
        return repository.save(resource);
    }

    // You can add PUT and DELETE here later
}
