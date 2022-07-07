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
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer or_qty;
    private Integer or_price;
    @ManyToOne
    @JoinColumn(name = "pr_product_id")
    private Products products;
    @ManyToOne
    @JoinColumn(name = "or_user_id")
    private Users users;
    @ManyToOne
    @JoinColumn(name = "or_transaction_id")
    private Transactions transactions;

    @Column(name = "created_at",columnDefinition="Timestamp" )
    private Timestamp created_at;

    @Column(name = "updated_at",columnDefinition="Timestamp" )
    private Timestamp updated_at;
}
