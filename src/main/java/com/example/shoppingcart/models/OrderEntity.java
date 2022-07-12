package com.example.shoppingcart.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
@ToString
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer or_quantity;
    private Integer or_price;
    @ManyToOne
    @JoinColumn(name = "pr_product_id")
    private ProductEntity productEntity;
    @OneToOne

    @JoinColumn(name = "or_user_id", referencedColumnName = "id")

    private UserEntity userEntity;
    @ManyToOne
    @JoinColumn(name = "or_transaction_id")
    private TransactionEntity transactionEntity;

    @Column(name = "created_at",columnDefinition="Timestamp" )
    private Timestamp createdat;

    @Column(name = "updated_at",columnDefinition="Timestamp" )
    private Timestamp updatedat;


    @OneToMany(mappedBy = "productEntityitem", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<OrderitemEntity> orderitemEntity;
}
