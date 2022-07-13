package com.example.shoppingcart.services.Impl;
import com.example.shoppingcart.repositories.OrderRepository;
import com.example.shoppingcart.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository ;
//    public Optional<Order_itemEntity> findByAll() {
//
////
////        return orderRepository.findById();
//    }

}
