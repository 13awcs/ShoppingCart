package com.example.shoppingcart.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer or_quantity;
    private Integer or_price;
    @ManyToOne
    @JoinColumn(name = "pr_product_id")
    private ProductEntity productEntity;
    @OneToOne
    @JoinColumn(name = "or_user_id")
    private UserEntity userEntity;
    @ManyToOne
    @JoinColumn(name = "or_transaction_id")
    private TransactionEntity transactionEntity;

    @Column(name = "created_at",columnDefinition="Timestamp" )
    private Timestamp created_at;

    @Column(name = "updated_at",columnDefinition="Timestamp" )
    private Timestamp updated_at;
}
