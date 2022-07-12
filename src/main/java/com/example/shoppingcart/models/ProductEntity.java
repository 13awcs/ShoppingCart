package com.example.shoppingcart.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pro_name;
    private Integer pro_price;
    private Integer active;
    private Integer pro_number;
    private String pro_description;
    private String pro_avatar;
    @Column(name = "created_at", columnDefinition = "Timestamp")
    private Timestamp created_at;
    @Column(name = "updated_at", columnDefinition = "Timestamp")
    private Timestamp updated_at;
    @ManyToOne
    @JoinColumn(name = "pro_category_id")
    private CategoryEntity categoryEntity;
    @ManyToOne
    @JoinColumn(name = "pro_author_id")
    private AdminEntity adminEntity;

    @JsonBackReference
    @OneToMany(mappedBy = "improductid", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<ImageEntity> images;

    @JsonBackReference
    @OneToMany(mappedBy = "productEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<OrderEntity> orders;

    @OneToMany(mappedBy = "productEntityitem", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<OrderitemEntity> orderitemEntity;

}
