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
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private Integer tr_user_id;
    private Integer tr_total;
    private String tr_note;
    private String address;
    private String phone;
    private Integer status;

    @Column(name = "created_at",columnDefinition="Timestamp" )
    private Timestamp created_at;

    @Column(name = "updated_at",columnDefinition="Timestamp" )
    private Timestamp updated_at;
}
