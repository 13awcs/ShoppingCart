package com.example.shoppingcart.services.Impl;

import com.example.shoppingcart.models.OrderItemEntity;
import com.example.shoppingcart.repositories.OrderItemRepository;
import com.example.shoppingcart.services.OrderItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class OrderItemServiceImpl implements OrderItemService {
    @Autowired
    OrderItemRepository orderItemRepository;
    public OrderItemServiceImpl(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }
    @Override
    public List<OrderItemEntity> getAll() {
        return orderItemRepository.getAll();
    }
}
