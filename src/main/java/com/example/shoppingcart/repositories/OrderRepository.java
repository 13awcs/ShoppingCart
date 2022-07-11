package com.example.shoppingcart.repositories;

import com.example.shoppingcart.models.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity,Long> {


    List<OrderEntity> findAll();
}
