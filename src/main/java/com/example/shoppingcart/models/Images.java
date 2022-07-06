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
public class Images {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer im_product_id;
    private String im_name;

    @Column(name = "created_at",columnDefinition="Timestamp" )
    private Timestamp created_at;

    @Column(name = "updated_at",columnDefinition="Timestamp" )
    private Timestamp updated_at;

}
