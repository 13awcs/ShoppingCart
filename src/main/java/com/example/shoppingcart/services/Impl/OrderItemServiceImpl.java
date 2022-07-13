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
    OrderItemRepository order_itemRepository;

    public OrderItemServiceImpl(OrderItemRepository order_itemRepository) {
        this.order_itemRepository = order_itemRepository;
    }

//    @Override
//    //@Query(value = "SELECT TOP ?est topNumber o.product_id,SUM(o.productEntity_item) FROM order_item o GROUP BY o.product_id ORDER BY SUM(order_item_quantity) DESC", nativeQuery = true)
//    public List<OrderItemEntity> findTop(int topNumber) {
        //return order_itemRepository.getAll();
//        log.info("topNumber"+topNumber) ;
//        Object a = order_itemRepository.findTop(3);
//        log.info("test11"+a) ;
//        return order_itemRepository.findTop(topNumber);


    //}

    @Override
    public List<OrderItemEntity> getAll() {
        return order_itemRepository.getAll();
    }
}
