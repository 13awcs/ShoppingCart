package com.example.shoppingcart.controllers;

import com.example.shoppingcart.common.ResponseObject;
import com.example.shoppingcart.repositories.ProductRepository;
import com.example.shoppingcart.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

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
    public ResponseEntity<ResponseObject> getAllProducts(){
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseObject
                ("successful", "insert successful", "insert successful " ,productService.getAllProduct()));
    }

    @GetMapping("/products/{query}")
    public ResponseEntity<ResponseObject> searchProducts(@PathVariable String query){
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseObject
                ("successful", "insert successful", "insert successful " ,productService.searchProducts(query)));
    }

    @GetMapping("/products/product-detail/{productId}")
    public Object getProductById(@PathVariable Long productId){
        return productService.getProductById(productId);
    }

    @GetMapping("category/{categoryId}/products")
    public ResponseEntity<ResponseObject> getProductsByCategoryId(@PathVariable Long categoryId){
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseObject
                ("successful", "insert successful", "insert successful " ,productService.getProductsByCategoryId(categoryId)));
    }
    @GetMapping("categories/{categoryId}/products/price/{min}/{max}")
    public ResponseEntity<ResponseObject> getProductsByRangePrice(@PathVariable Long categoryId,@PathVariable Integer min,@PathVariable Integer max){
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseObject
                ("successful", "insert successful", "insert successful " ,productService.getProductByRangePrice(categoryId,min,max)));
    }

    @GetMapping("categories/{categoryId}/products/{dateProduct}")
    public ResponseEntity<ResponseObject> getProductsByRangePrice(@PathVariable Long categoryId,@PathVariable String dateProduct){
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseObject
                ("successful", "insert successful", "insert successful " ,productService.getProductsByDate(categoryId,dateProduct)));
    }

    @GetMapping("categories/{categoryId}/products/newest-products")
    public ResponseEntity<ResponseObject> getNewestProductsByCategoryId(@PathVariable Long categoryId){
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseObject
                ("successful", "insert successful", "insert successful " ,productService.getNewestProductsByCategoryId(categoryId)));
    }

}
