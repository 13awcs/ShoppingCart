package com.example.shoppingcart.controllers;

import com.example.shoppingcart.repositories.AdminRepository;
import com.example.shoppingcart.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

}
