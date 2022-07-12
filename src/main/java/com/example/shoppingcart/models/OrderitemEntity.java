package com.example.shoppingcart.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order_item")
@ToString
public class OrderitemEntity {

    @EmbeddedId
    private OrderitemKey id;
    @ManyToOne()
    @JsonBackReference
    @MapsId("productid")
    @JoinColumn(name = "product_id")
    private ProductEntity productEntityitem;

    @ManyToOne
    @JsonBackReference
    @MapsId("orderid")
    @JoinColumn(name = "order_id")
    private OrderEntity orderEntityitem;
    @JoinColumn(name = "order_item_price")

    private Integer orderitemquantity;
    @JoinColumn(name = "order_item_quantity")

    private Float orderitemprice;


}
