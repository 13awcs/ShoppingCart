package com.example.shoppingcart.controllers;


import com.example.shoppingcart.common.ResponseObject;
import com.example.shoppingcart.services.OrderItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping(name = "user/home")
public class HomeController {
    @Autowired
    OrderItemService orderItemService;
    @GetMapping("orderitem")
    public ResponseEntity<ResponseObject> getAll(){
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseObject
                ("successful", "insert successful", "insert successful " ,orderItemService.getAll()));
    }
}
