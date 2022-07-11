package com.example.shoppingcart.services;

import com.example.shoppingcart.dtos.reponseDTO.OrderDTO;

import org.springframework.stereotype.Service;

import java.util.List;


public interface OrderService   {


    List<OrderDTO> findAll();
}
