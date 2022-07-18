package com.example.shoppingcart.dtos.mapper;

import com.example.shoppingcart.dtos.responseDto.OrderItemResponseDto;
import com.example.shoppingcart.models.OrderItemEntity;

public class OrderItemMapper {
    public static OrderItemResponseDto orderItemToOrderItemResponseDto(OrderItemEntity orderItemEntity){
        OrderItemResponseDto orderItemResponseDto = new OrderItemResponseDto();
        orderItemResponseDto.setProductId(orderItemEntity.getProductEntityItem().getId());
        orderItemResponseDto.setOrderId(orderItemEntity.getOrderEntityItem().getId());
        orderItemResponseDto.setQuantity(orderItemEntity.getOrderItemQuantity());
        orderItemResponseDto.setProductPrice(orderItemEntity.getProductEntityItem().getPrice());
        return orderItemResponseDto;
    }
}
