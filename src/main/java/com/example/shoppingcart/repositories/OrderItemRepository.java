package com.example.shoppingcart.repositories;

import com.example.shoppingcart.models.OrderitemEntity;
import com.example.shoppingcart.models.OrderitemKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderitemEntity, OrderitemKey> {

}
