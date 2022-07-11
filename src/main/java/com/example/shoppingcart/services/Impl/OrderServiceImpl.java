package com.example.shoppingcart.services.Impl;
import com.example.shoppingcart.dtos.mapper;
import com.example.shoppingcart.dtos.reponseDTO.OrderDTO;
import com.example.shoppingcart.models.OrderEntity;
import com.example.shoppingcart.repositories.OrderRepository;
import com.example.shoppingcart.services.OrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
@Service

public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository ;
  private mapper mapper ;
    @Override
    public List<OrderDTO> findAll() {
        List<OrderEntity> orderEntity = orderRepository.findAll() ;

        return mapper.ListOrderEntityConvertListOrderDTO(orderEntity);


    }

}
