package com.example.shoppingcart.services;

import com.example.shoppingcart.models.Order_itemEntity;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderItemService {

    //@Query(value = "SELECT TOP ? topNumber o.product_id,SUM(o.productEntity_item) FROM order_item o GROUP BY o.product_id ORDER BY SUM(order_item_quantity) DESC", nativeQuery = true)
    List<Order_itemEntity> findTop(int topNumber);
}
