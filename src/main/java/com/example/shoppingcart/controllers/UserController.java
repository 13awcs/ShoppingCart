package com.example.shoppingcart.controllers;

import com.example.shoppingcart.common.ResponseObject;
import com.example.shoppingcart.dtos.requestDto.UserRequestDto;
import com.example.shoppingcart.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user/home")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("profile-user/{userId}")
    public Object getUserById(@PathVariable Long userId){
        return userService.getUserById(userId);
    }

    @PostMapping("profile-user/{userId}")
    public Object editUser(@PathVariable Long userId, UserRequestDto userRequestDto){
        return userService.editUser(userId,userRequestDto);
    }
}
