package com.example.shoppingcart.services.Impl;

import com.example.shoppingcart.common.ResponseObject;
import com.example.shoppingcart.dtos.mapper.OrderItemMapper;
import com.example.shoppingcart.dtos.mapper.ProductMapper;
import com.example.shoppingcart.dtos.requestDto.OrderItemRequestDto;
import com.example.shoppingcart.dtos.responseDto.OrderItemResponseDto;
import com.example.shoppingcart.dtos.responseDto.ProductResponseDto;
import com.example.shoppingcart.models.OrderEntity;
import com.example.shoppingcart.models.OrderItemEntity;
import com.example.shoppingcart.models.OrderItemKey;
import com.example.shoppingcart.models.ProductEntity;
import com.example.shoppingcart.repositories.OrderItemRepository;
import com.example.shoppingcart.repositories.OrderRepository;
import com.example.shoppingcart.repositories.ProductRepository;
import com.example.shoppingcart.repositories.jpaObjecty.TopNumber;
import com.example.shoppingcart.services.OrderItemService;
import com.example.shoppingcart.services.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class OrderItemServiceImpl implements OrderItemService {
    OrderItemRepository orderItemRepository;
    ProductService productService;
    ProductRepository productRepository  ;
    OrderRepository orderRepository ;
    @Autowired
    public OrderItemServiceImpl(OrderItemRepository orderItemRepository, ProductService productService, ProductRepository productRepository, OrderRepository orderRepository) {
        this.orderItemRepository = orderItemRepository;
        this.productService = productService;
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
    }

    public OrderItemServiceImpl(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }
    @Override
    public List<OrderItemEntity> getAll() {
        return orderItemRepository.getAll();
    }

    @Override
    public OrderItemResponseDto addProductToOrder(OrderItemRequestDto orderItemRequestDto) {
        OrderItemEntity orderItemEntity = new OrderItemEntity();

        Optional<ProductEntity> productEntity = productRepository.findById(orderItemRequestDto.getProductId());
        Optional<OrderEntity> orderEntity = orderRepository.findById(orderItemRequestDto.getOrderId());
        log.info("haha"+productEntity);
        if(productEntity.isEmpty()){
            ResponseEntity.status(HttpStatus.CREATED).
                    body(new ResponseObject("ERROR", "validate", " " + orderItemRequestDto.getProductId()+ " ", "Product Id is not found"));
        }
        if(orderEntity.isEmpty()){
            ResponseEntity.status(HttpStatus.CREATED).
                    body(new ResponseObject("ERROR", "validate", " " + orderItemRequestDto.getOrderId()+ " ", "Order Id is not found"));
        }
        orderItemEntity.setOrderItemQuantity(orderItemRequestDto.getQuantity());
        OrderItemKey orderItemKey = new OrderItemKey(orderItemRequestDto.getProductId(),orderItemRequestDto.getOrderId());
        orderItemEntity.setId(orderItemKey);
        orderItemEntity.setOrderItemPrice(productEntity.get().getPrice());
        orderItemEntity.setProductEntityItem(productEntity.get());
        orderItemEntity.setOrderEntityItem(orderEntity.get());

        return OrderItemMapper.orderItemToOrderItemResponseDto(orderItemRepository.save(orderItemEntity));
    }

}
