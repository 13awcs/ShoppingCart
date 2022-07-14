package com.example.shoppingcart.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
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

    @Column(name = "pro_name")
    private String name;

    @Column(name = "pro_price")
    private Integer price;

    @Column(name = "pro_active")
    private Integer active;

    @Column(name = "pro_number")
    private Integer number;

    @Column(name = "pro_description")
    private String description;

    @Column(name = "pro_avatar")
    private String avatar;

    @JsonFormat(pattern = "dd-mmm-yyyy hh:mm:ss")
    @Column(name = "created_at")
    @CreationTimestamp
    private Timestamp createdAt;

    @JsonFormat(pattern = "dd-mmm-yyyy hh:mm:ss")
    @Column(name = "updated_at")
    @UpdateTimestamp
    private Timestamp updatedAt;

    @ManyToOne
    @JoinColumn(name = "pro_category_id")
    private CategoryEntity categoryEntity;

    @ManyToOne
    @JoinColumn(name = "pro_author_id")
    private AdminEntity adminEntity;

    @JsonBackReference
    @OneToMany(mappedBy = "imageProductId", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<ImageEntity> images;

    @OneToMany(mappedBy = "productEntityItem", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<OrderItemEntity> orderItemEntities;

}
