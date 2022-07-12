package com.example.shoppingcart.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class OrderitemKey implements Serializable {
    @Column(name = "order_id")
    Long orderid;

    @Column(name = "product_id")
    Long productid;


}
