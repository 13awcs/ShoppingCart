package com.example.shoppingcart.controllers;

import com.example.shoppingcart.common.ResponseObject;
import com.example.shoppingcart.dtos.responseDto.ProductResponseDto;
import com.example.shoppingcart.models.ProductEntity;
import com.example.shoppingcart.repositories.AdminRepository;
import com.example.shoppingcart.repositories.ProductRepository;
import com.example.shoppingcart.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products/{field}/{topNumber}")
    public ResponseEntity<ResponseObject> getNewestProduct(@PathVariable String field,@PathVariable int topNumber){
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseObject
                ("successful", "insert successful", "insert successful " ,productService.getNewestProduct(field,topNumber)));
    }

    @GetMapping("/products")
    public ResponseEntity<ResponseObject> getNewestProduct(){
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseObject
                ("successful", "insert successful", "insert successful " ,productService.getAllProduct()));
    }

    @GetMapping("/products/{query}")
    public ResponseEntity<ResponseObject> searchProducts(@PathVariable String query){

        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseObject
                ("successful", "insert successful", "insert successful " ,productService.searchProducts(query)));
    }

    @GetMapping("category/{categoryId}/products")
    public ResponseEntity<ResponseObject> getProductsByCategoryId(@PathVariable Long categoryId){
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseObject
                ("successful", "insert successful", "insert successful " ,productService.getProductsByCategoryId(categoryId)));
    }


}
