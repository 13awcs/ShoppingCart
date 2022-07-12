package com.example.shoppingcart;

import com.example.shoppingcart.models.OrderitemKey;
import com.example.shoppingcart.repositories.OrderItemRepository;
import com.example.shoppingcart.services.OrderItemService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
public class Order_itemServiceTest {
    @Autowired
    OrderItemService order_itemService ;
    @Autowired
    OrderItemRepository order_itemRepository ;
     @Test
    void  TestdeletefindById(){
    OrderitemKey orderitemKey =new OrderitemKey(1L,1L) ;
    order_itemService.delete_product_in_order(orderitemKey);
       Boolean orderEntity =order_itemRepository.existsById(orderitemKey) ;

        log.info("orderEntity"+orderEntity);
        assertFalse(orderEntity);

    }

}
