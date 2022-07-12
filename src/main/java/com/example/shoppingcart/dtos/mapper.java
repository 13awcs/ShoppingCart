package com.example.shoppingcart.dtos;

import com.example.shoppingcart.dtos.reponseDTO.OrderDTO;
import com.example.shoppingcart.models.OrderEntity;

import java.util.ArrayList;
import java.util.List;

public class mapper {
    public static OrderDTO OrderEntityConvertOrderDTO(OrderEntity orderEntity) {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setId(orderEntity.getId());
        orderDTO.setOr_price(orderEntity.getOr_price());
        orderDTO.setOr_quantity(orderEntity.getOr_quantity());
        orderDTO.setOr_product_id(orderEntity.getProductEntity().getId());
        orderDTO.setOr_transacion_id(orderEntity.getTransactionEntity().getId());
        orderDTO.setOr_user_id(orderEntity.getUserEntity().getId());
        return orderDTO;
    }

    public static List<OrderDTO> ListOrderEntityConvertListOrderDTO(List<OrderEntity> orderEntity){
        List<OrderDTO> orderDTO = new ArrayList<>();
        for (OrderEntity order: orderEntity) {
            orderDTO.add(OrderEntityConvertOrderDTO(order));
        }
        return orderDTO;
    }


}
