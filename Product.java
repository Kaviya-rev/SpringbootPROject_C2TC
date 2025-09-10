package com.tnsif.restapi;

import org.springframework.stereotype.Component;

@Component
public class Product {
    private int id = 1;
    private String name = "Laptop";

    // Constructor
    public Product() {
        System.out.println("Product object created");
    }

    // Method to display product details
    public void display() {
        System.out.println("Product ID: " + id + ", Name: " + name);
    }
}
