package com.example.shoppingcart.services;

import com.example.shoppingcart.models.OrderItemEntity;

import java.util.List;

public interface OrderItemService {

    //@Query(value = "SELECT TOP ? topNumber o.product_id,SUM(o.productEntity_item) FROM order_item o GROUP BY o.product_id ORDER BY SUM(order_item_quantity) DESC", nativeQuery = true)
    //List<OrderItemEntity> findTop(int topNumber);
    List<OrderItemEntity> getAll();
}
