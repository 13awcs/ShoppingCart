package com.example.shoppingcart.services;

import com.example.shoppingcart.dtos.requestDto.OrderItemRequestDto;
import com.example.shoppingcart.dtos.responseDto.OrderItemResponseDto;
import com.example.shoppingcart.models.OrderItemEntity;
import com.example.shoppingcart.repositories.jpaObjecty.TopNumber;

import java.util.List;

public interface OrderItemService {
    List<OrderItemEntity> getAll();
    OrderItemResponseDto addProductToOrder(OrderItemRequestDto orderItemRequestDto);
}
