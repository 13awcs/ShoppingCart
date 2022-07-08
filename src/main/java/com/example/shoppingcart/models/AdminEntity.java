package com.example.shoppingcart.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "admins")
public class AdminEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String email;
    private String phone;
    private String avatar;
    private Integer active;
    private String password;

    @Column(name = "created_at",columnDefinition="Timestamp" )
    private Timestamp created_at;

    @Column(name = "updated_at",columnDefinition="Timestamp" )
    private Timestamp updated_at;
    @JsonBackReference
    @OneToMany(mappedBy = "adminEntity",cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
    private List<CategoryEntity> categories;
    @JsonBackReference
    @OneToMany(mappedBy = "adminEntity",cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
    private List<ProductEntity> products;

}