package com.example.shoppingcart.repositories;

import com.example.shoppingcart.models.OrderEntity;
import com.example.shoppingcart.models.Order_itemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity,Integer> {
//    Optional<Order_itemEntity> findById();
}
