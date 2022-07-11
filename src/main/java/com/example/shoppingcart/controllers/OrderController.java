package com.example.shoppingcart.controllers;

import com.example.shoppingcart.dtos.reponseDTO.OrderDTO;
import com.example.shoppingcart.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class OrderController {
    @Autowired
    OrderService orderService ;


    @GetMapping("test")
    public List<OrderDTO> getAllPosts() {

        return orderService.findAll() ;
    }

}
