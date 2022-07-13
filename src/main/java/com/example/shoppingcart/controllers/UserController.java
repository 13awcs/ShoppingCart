package com.example.shoppingcart.controllers;

import com.example.shoppingcart.common.ResponseObject;
import com.example.shoppingcart.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user/home")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("profileuser/{userId}")
    public ResponseEntity<ResponseObject> getUserById(@PathVariable Long userId){
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseObject
                ("successful", "insert successful", "insert successful " ,userService.getUserById(userId)));
    }
}
