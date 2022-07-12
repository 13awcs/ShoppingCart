package com.example.shoppingcart.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "categories")
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id")
    private Long id;
    @JoinColumn(name = "c_name")
    private String name;
    @JoinColumn(name = "c_icon")
    private String icon;
    @JoinColumn(name = "c_avatar")
    private String avatar;
    @JoinColumn(name = "c_active")

    private Integer active;
    @JoinColumn(name = "c_total_product")

    private Integer totalproduct;
    @ManyToOne
    @JoinColumn(name = "c_author_id")
    private AdminEntity adminEntity;

    @Column(name = "created_at", columnDefinition = "Timestamp")
    private Timestamp createdat;

    @Column(name = "updated_at", columnDefinition = "Timestamp")
    private Timestamp updatedat;
    @JsonBackReference
    @OneToMany(mappedBy = "categoryEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<ProductEntity> products;

}
