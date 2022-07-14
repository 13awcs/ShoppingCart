package com.example.shoppingcart.services;

import com.example.shoppingcart.models.OrderItemEntity;

import java.util.List;

public interface OrderItemService {
    List<OrderItemEntity> getAll();
}
