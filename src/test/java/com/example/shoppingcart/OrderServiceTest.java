package com.example.shoppingcart;

import com.example.shoppingcart.common.ResponseObject;
import com.example.shoppingcart.dtos.mapper;
import com.example.shoppingcart.dtos.reponseDTO.OrderDTO;
import com.example.shoppingcart.models.OrderEntity;
import com.example.shoppingcart.repositories.OrderRepository;
import com.example.shoppingcart.services.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
public class OrderServiceTest {


@Autowired
  OrderService orderService;

@Autowired
    OrderRepository orderRepository;

    mapper mapper;

    @Test
    void Test_findAll_Service() {
        List<OrderDTO> orderDTOList = orderService.findAll();
        List<OrderEntity> orderEntityList = orderRepository.findAll();

        List<OrderDTO> orderEntityListconvertorderDTOList =mapper.ListOrderEntityConvertListOrderDTO(orderEntityList);


        assertEquals(orderDTOList, orderEntityListconvertorderDTOList);
    }

    @Test
    void Test_update_product_order_Service() {

OrderEntity



        assertEquals(orderDTOList, orderEntityListconvertorderDTOList);
    }

}
