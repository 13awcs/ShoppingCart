package com.example.shoppingcart.controllers;


import com.example.shoppingcart.common.ResponseObject;
import com.example.shoppingcart.models.CategoryEntity;
import com.example.shoppingcart.repositories.CategoryRepository;
import com.example.shoppingcart.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/user/home")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
     @GetMapping("category")
     public ResponseEntity<ResponseObject> getAllCategory(){
         return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(new ResponseObject
                 ("successful", "insert successful", "insert successful " ,categoryService.getCategories()));

     }

}
