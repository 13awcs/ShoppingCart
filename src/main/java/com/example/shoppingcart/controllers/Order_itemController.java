package com.example.shoppingcart.controllers;

import com.example.shoppingcart.common.ResponseObject;
import com.example.shoppingcart.models.OrderitemKey;
import com.example.shoppingcart.services.OrderItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
@Slf4j
public class Order_itemController {
@Autowired

OrderItemService order_itemService ;
    @DeleteMapping("/{user_id}/order_items")
    ResponseEntity<ResponseObject> deleteProduct(@RequestBody OrderitemKey orderitemKey, @PathVariable Long user_id){
        log.info(""+user_id);
        log.info("order_itemKey:"+ orderitemKey);
        return  order_itemService.delete_product_in_order(orderitemKey) ;
    }
}
