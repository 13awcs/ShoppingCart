package com.example.shoppingcart.controllers;

import com.example.shoppingcart.common.ResponseObject;
import com.example.shoppingcart.dtos.requestDto.OrderItemRequestDto;
import com.example.shoppingcart.repositories.OrderItemRepository;
import com.example.shoppingcart.services.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Pattern;

@RestController
public class OrderItemController {

    @Autowired
    OrderItemService orderItemService;

    @Autowired
    OrderItemRepository orderItemRepository;
    @PostMapping("user/{userId}/home/order-item")
    public ResponseEntity<ResponseObject> addProductToOrder(@PathVariable Long userId, OrderItemRequestDto orderItemRequestDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseObject
                ("successful", "insert successful", "insert successful " ,orderItemService.addProductToOrder(orderItemRequestDto)));
    }
    @GetMapping("order-item")
    public ResponseEntity<ResponseObject> getAll(){
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseObject
                ("successful", "insert successful", "insert successful " ,orderItemService.getAll()));
    }

    @GetMapping("products/top-products/{topNumber}")
    public ResponseEntity<ResponseObject> findTop(@PathVariable int topNumber){
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseObject
                ("successful", "insert successful", "insert successful " ,orderItemRepository.findTop(topNumber)));
    }

    @GetMapping("categories/{categoryId}/products/top-products/{topNumber}")
    public ResponseEntity<ResponseObject> findTop(@PathVariable int topNumber,@PathVariable Long categoryId){
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseObject
                ("successful", "insert successful", "insert successful " ,orderItemRepository.findTopByCategory(topNumber,categoryId)));
    }
}
