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
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    private ProductEntity productEntityItem;

    @ManyToOne
    @JsonBackReference
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
    private OrderEntity orderEntityItem;

    @Column(name = "order_item_quantity")
    private Integer orderItemQuantity;

    @Column(name = "order_item_price")
    private Float orderItemPrice;

    @Override
    public String toString() {
        return "Order_itemEntity{" +
                "productEntity_item=" + productEntityItem +
                ", orderEntity_item=" + orderEntityItem +
                ", order_item_quantity=" + orderItemQuantity +
                ", order_item_price=" + orderItemPrice +
                '}';
    }
}
