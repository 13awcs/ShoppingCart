package com.example.shoppingcart.test;

import com.example.shoppingcart.common.exceptions.GlobalExceptionHandler;
import com.example.shoppingcart.common.exceptions.ResourceNotFoundException;
import com.example.shoppingcart.dtos.mapper.OrderItemMapper;
import com.example.shoppingcart.dtos.requestDto.OrderItemRequestDto;
import com.example.shoppingcart.dtos.responseDto.OrderItemResponseDto;
import com.example.shoppingcart.models.OrderItemEntity;
import com.example.shoppingcart.models.OrderItemKey;
import com.example.shoppingcart.repositories.OrderItemRepository;
import com.example.shoppingcart.services.OrderItemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class OrderItemServiceImplTest {
    @Autowired
    OrderItemService orderItemService;
    @Autowired
    OrderItemRepository orderItemRepository;
    @Autowired
    GlobalExceptionHandler globalExceptionHandler;
    @Test
    public void addProductTest(){
        OrderItemRequestDto orderItemRequestDto = new OrderItemRequestDto(1L,2L,3);
        OrderItemResponseDto orderItemResponseDto = orderItemService.addProductToOrder(orderItemRequestDto);
        OrderItemKey orderItemKey = new OrderItemKey(2L,1L);
        OrderItemEntity orderItemEntity = orderItemRepository.findById(orderItemKey).orElseThrow(()->
        new IllegalArgumentException("Id "+orderItemKey+" not found"));
        assertEquals(OrderItemMapper.orderItemToOrderItemResponseDto(orderItemEntity),orderItemResponseDto);
    }
    @Test
    public void JUnitTestaddProduct(){
        HttpStatus status = HttpStatus.NOT_FOUND;
        OrderItemRequestDto orderItemRequestDto = new OrderItemRequestDto(7L,8L,3);
        ResourceNotFoundException exception = assertThrows(ResourceNotFoundException.class, () -> {
            orderItemService.addProductToOrder(orderItemRequestDto);
        });
        ResponseEntity<?> errorResponse = globalExceptionHandler.handleResourceNotFoundException(exception) ;
        ResourceNotFoundException notFoundException = new ResourceNotFoundException("Product with id 7 not found");
        assertEquals(exception.getMessage(), notFoundException.getMessage());
        assertEquals(status, errorResponse.getStatusCode());

    }

}
