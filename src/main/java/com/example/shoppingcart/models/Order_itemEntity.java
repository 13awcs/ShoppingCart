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
public class Order_itemEntity {

    @EmbeddedId
    private Order_itemKey id;
    @ManyToOne()
    @JsonBackReference
    @MapsId("product_id")
    @JoinColumn(name = "product_id")
    private ProductEntity productEntity_item;

    @ManyToOne
    @JsonBackReference
    @MapsId("order_id")
    @JoinColumn(name = "order_id")
    private OrderEntity orderEntity_item;

    private Integer order_item_quantity;

    private Float order_item_price;


}
