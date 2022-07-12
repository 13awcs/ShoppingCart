package com.example.shoppingcart.services;

import com.example.shoppingcart.common.ResponseObject;
import com.example.shoppingcart.models.OrderitemKey;
import org.springframework.http.ResponseEntity;

public interface OrderItemService {
    ResponseEntity<ResponseObject> delete_product_in_order(OrderitemKey orderitemKey) ;
}
