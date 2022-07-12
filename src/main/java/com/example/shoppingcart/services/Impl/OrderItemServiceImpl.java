package com.example.shoppingcart.services.Impl;

import com.example.shoppingcart.common.ResponseObject;
import com.example.shoppingcart.models.OrderitemKey;
import com.example.shoppingcart.repositories.OrderItemRepository;
import com.example.shoppingcart.services.OrderItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderItemServiceImpl implements OrderItemService {
    @Autowired
    OrderItemRepository order_itemRepository;

    @Override
    public ResponseEntity<ResponseObject> delete_product_in_order(OrderitemKey orderitemKey) {
        boolean order_item = order_itemRepository.existsById(orderitemKey);
        log.info("exists :" + order_item);

        if (order_item) {
            order_itemRepository.deleteById(orderitemKey);
            return ResponseEntity.status(HttpStatus.OK)

                    .body(new ResponseObject(
                            "ok", "", "delete product successfully", ""));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).
                    body(new ResponseObject
                            ("ORDERSERROR03", "id", "cannot find product to delete ", "validate"));
        }
    }


}
