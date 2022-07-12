package com.example.shoppingcart.controllers;

import com.example.shoppingcart.common.ResponseObject;
import com.example.shoppingcart.dtos.reponseDTO.OrderDTO;
import com.example.shoppingcart.services.OrderService;
import com.example.shoppingcart.vo.update_Order_VO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class OrderController {
    @Autowired
    OrderService orderService;


    @GetMapping("{user_id}/orders")
    public List<OrderDTO> getAllPosts() {

        return orderService.findAll();
    }

    @PostMapping("{user_id}/orders")
    public ResponseEntity<ResponseObject> update_product_order(@RequestBody update_Order_VO update_order_vo, @PathVariable Long user_id) {
        return orderService.update_product_order(update_order_vo);
    }
}