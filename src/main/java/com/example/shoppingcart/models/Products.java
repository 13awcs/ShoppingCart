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
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String pro_name;
    private Integer pro_category_id;
    private Integer pro_price;
    private Integer pro_author_id;
    private Integer active;
    private Integer pro_number;
    private String pro_description;
    private String pro_avatar;

    @Column(name = "created_at",columnDefinition="Timestamp" )
    private Timestamp created_at;

    @Column(name = "updated_at",columnDefinition="Timestamp" )
    private Timestamp updated_at;
}
