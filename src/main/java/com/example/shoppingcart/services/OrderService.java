package com.example.shoppingcart.services;

import com.example.shoppingcart.common.ResponseObject;
import com.example.shoppingcart.dtos.reponseDTO.OrderDTO;

import com.example.shoppingcart.vo.update_Order_VO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


public interface OrderService   {


    List<OrderDTO> findAll();

    ResponseEntity<ResponseObject> update_product_order(@RequestBody update_Order_VO update_order_vo);
}
