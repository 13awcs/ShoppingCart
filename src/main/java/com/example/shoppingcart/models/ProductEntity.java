package com.example.shoppingcart.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

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

    @JsonFormat(pattern = "dd-mmm-yyyy hh:mm:ss")
    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime created_at;

    @JsonFormat(pattern = "dd-mmm-yyyy hh:mm:ss")
    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updated_at;

    @ManyToOne
    @JoinColumn(name = "pro_category_id")
    private CategoryEntity categoryEntity;

    @ManyToOne
    @JoinColumn(name = "pro_author_id")
    private AdminEntity adminEntity;

    @JsonBackReference
    @OneToMany(mappedBy = "im_product_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<ImageEntity> images;

    @JsonBackReference
    @OneToMany(mappedBy = "productEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<OrderEntity> orders;

    @OneToMany(mappedBy = "productEntity_item", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Order_itemEntity> order_itemEntity;

}
