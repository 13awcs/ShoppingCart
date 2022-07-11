package com.example.shoppingcart.services.Impl;
import com.example.shoppingcart.models.Order_itemEntity;
import com.example.shoppingcart.repositories.OrderRepository;
import com.example.shoppingcart.services.OrderService;
import com.example.shoppingcart.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository ;
//    public Optional<Order_itemEntity> findByAll() {
//
////
////        return orderRepository.findById();
//    }

}
