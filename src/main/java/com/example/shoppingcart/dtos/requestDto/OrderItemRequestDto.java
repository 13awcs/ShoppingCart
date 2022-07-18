package com.example.shoppingcart.dtos.requestDto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderItemRequestDto {
    private Long productId;
    private Long orderId;
    private Integer quantity;
}
