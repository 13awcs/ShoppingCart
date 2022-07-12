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
@Table(name = "images")
public class ImageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id")
    private Long id;
    @JoinColumn(name = "im_name")
    private String imname;
    @Column(name = "created_at",columnDefinition="Timestamp" )
    private Timestamp createdat;

    @Column(name = "updated_at",columnDefinition="Timestamp" )
    private Timestamp updatedat;
    @ManyToOne
    @JoinColumn(name = "im_product_id")
    private ProductEntity improductid;
}
