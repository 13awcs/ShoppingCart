package com.example.shoppingcart.controllers;


import com.example.shoppingcart.common.ResponseObject;
import com.example.shoppingcart.services.OrderItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping(name = "user/home")
public class HomeController {

    @Autowired
    OrderItemService orderItemService;

    @GetMapping("orderitem/{topNumber}")
    public ResponseEntity<ResponseObject> findTop(@PathVariable int topNumber){
        log.info("test"+topNumber) ;
        orderItemService.findTop(topNumber) ;

        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(new ResponseObject
                ("successful", "insert successful", "insert successful " ,orderItemService.findTop(topNumber)));

    }
}
