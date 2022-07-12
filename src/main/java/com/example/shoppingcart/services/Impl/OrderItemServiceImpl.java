package com.example.shoppingcart.services.Impl;

import com.example.shoppingcart.models.Order_itemEntity;
import com.example.shoppingcart.repositories.Order_itemRepository;
import com.example.shoppingcart.services.OrderItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class OrderItemServiceImpl implements OrderItemService {
    @Autowired
    Order_itemRepository order_itemRepository;

    public OrderItemServiceImpl(Order_itemRepository order_itemRepository) {
        this.order_itemRepository = order_itemRepository;
    }

    @Override
    //@Query(value = "SELECT TOP ?est topNumber o.product_id,SUM(o.productEntity_item) FROM order_item o GROUP BY o.product_id ORDER BY SUM(order_item_quantity) DESC", nativeQuery = true)
    public List<Order_itemEntity> findTop(int topNumber) {
        log.info("topNumber"+topNumber) ;
        Object a = order_itemRepository.findTop(3);
        log.info("test11"+a) ;
        return order_itemRepository.findTop(topNumber);

    }
}
