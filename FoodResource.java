package com.example.foodapi.model;

import jakarta.persistence.*;

@Entity
public class FoodResource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private String type;  // e.g. "Food Bank", "Soup Kitchen"
    private String hours;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getHours() { return hours; }
    public void setHours(String hours) { this.hours = hours; }
}
