package com.example.shoppingcart.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor

public class Order_itemKey implements Serializable {
    @Column(name = "order_id")
    Long order_id;

    @Column(name = "product_id")
    Long product_id;



}
