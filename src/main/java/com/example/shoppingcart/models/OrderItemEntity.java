package com.example.shoppingcart.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order_item")

public class OrderItemEntity {

    @EmbeddedId
    private OrderItemKey id;
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

    @Override
    public String toString() {
        return "Order_itemEntity{" +
                "productEntity_item=" + productEntity_item +
                ", orderEntity_item=" + orderEntity_item +
                ", order_item_quantity=" + order_item_quantity +
                ", order_item_price=" + order_item_price +
                '}';
    }
}
