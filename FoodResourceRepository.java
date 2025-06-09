package com.example.foodapi.repository;

import com.example.foodapi.model.FoodResource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodResourceRepository extends JpaRepository<FoodResource, Long> {}
