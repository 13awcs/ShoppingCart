package com.example.shoppingcart.repositories;

import com.example.shoppingcart.models.OrderItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItemEntity,Long> {

    @Query(nativeQuery = true, value = "SELECT TOP 3  PRODUCT_ID FROM ORDER_ITEM GROUP BY PRODUCT_ID ORDER BY SUM(ORDER_ITEM_QUANTITY) DESC")
    List<OrderItemEntity> getAll();
    //List<OrderItemEntity> findTop(int topNumber);


}
