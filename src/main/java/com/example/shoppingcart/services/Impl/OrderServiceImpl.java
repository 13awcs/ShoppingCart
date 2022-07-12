package com.example.shoppingcart.services.Impl;

import com.example.shoppingcart.common.ResponseObject;
import com.example.shoppingcart.dtos.mapper;
import com.example.shoppingcart.dtos.reponseDTO.OrderDTO;
import com.example.shoppingcart.models.OrderEntity;
import com.example.shoppingcart.repositories.OrderRepository;
import com.example.shoppingcart.services.OrderService;
import com.example.shoppingcart.vo.update_Order_VO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    private mapper mapper;

    @Override
    public List<OrderDTO> findAll() {
        List<OrderEntity> orderEntity = orderRepository.findAll();

        return mapper.ListOrderEntityConvertListOrderDTO(orderEntity);
    }

    @Override
    public ResponseEntity<ResponseObject> update_product_order(update_Order_VO update_order_vo) {
        log.info("update_order_vo:" + update_order_vo);
        Boolean exists = orderRepository.existsById(update_order_vo.getId());
        log.info("exists" + exists);

        if (!exists) {
            log.info("Error");
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("id not fond ", " id", "ORDERSERROR03", "validate"));

        }
        updateorderproduct(update_order_vo);


        return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "update Product successfully", "", ""));
    }


    public void updateorderproduct(update_Order_VO update_order_vo) {
        orderRepository
                .findById(update_order_vo.getId()) // returns Optional<User>
                .ifPresent(orderEntity -> {
                    orderEntity.setOr_quantity(update_order_vo.getOr_quantity());


                    orderRepository.save(orderEntity);
                });


    }


}
