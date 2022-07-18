package com.example.shoppingcart;

import com.example.shoppingcart.dtos.mapper.OrderItemMapper;
import com.example.shoppingcart.dtos.requestDto.OrderItemRequestDto;
import com.example.shoppingcart.dtos.responseDto.OrderItemResponseDto;
import com.example.shoppingcart.models.OrderItemEntity;
import com.example.shoppingcart.models.OrderItemKey;
import com.example.shoppingcart.repositories.OrderItemRepository;
import com.example.shoppingcart.repositories.jpaObjecty.TopNumber;
import com.example.shoppingcart.services.OrderItemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class OrderItemServiceImplTest {
    @Autowired
    OrderItemService orderItemService;
    @Autowired
    OrderItemRepository orderItemRepository;
    @Test
    public void addProductTest(){
        OrderItemRequestDto orderItemRequestDto = new OrderItemRequestDto(1L,2L,3);
        OrderItemResponseDto orderItemResponseDto = orderItemService.addProductToOrder(orderItemRequestDto);
        OrderItemKey orderItemKey = new OrderItemKey(2L,1L);
        OrderItemEntity orderItemEntity = orderItemRepository.findById(orderItemKey).orElseThrow(()->
        new IllegalArgumentException("Id "+orderItemKey+" not found"));
        assertEquals(OrderItemMapper.orderItemToOrderItemResponseDto(orderItemEntity),orderItemResponseDto);
    }

}
