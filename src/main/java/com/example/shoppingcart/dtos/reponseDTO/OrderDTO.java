package com.example.shoppingcart.dtos.reponseDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderDTO {
    private Long id;
    private Long or_transacion_id;
    private Long or_product_id;
    private Long or_user_id;
    private Integer or_quantity;
    private Integer or_price;

}
