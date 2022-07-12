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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id")
    private Long id;
    @JoinColumn(name = "ad_name")
    private String name;
    @JoinColumn(name = "ad_email")
    private String email;
    @JoinColumn(name = "ad_phone")
    private String phone;
    @JoinColumn(name = "ad_avatar")
    private String avatar;
    @JoinColumn(name = "ad_active")
    private Integer active;
    @JoinColumn(name = "ad_phone")
    private String password;
    @JoinColumn(name = "ad_password")

    @Column(name = "created_at",columnDefinition="Timestamp" )
    private Timestamp createdat;

    @Column(name = "updated_at",columnDefinition="Timestamp" )
    private Timestamp updatedat;
    @JsonBackReference
    @OneToMany(mappedBy = "adminEntity",cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
    private List<CategoryEntity> categories;
    @JsonBackReference
    @OneToMany(mappedBy = "adminEntity",cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
    private List<ProductEntity> products;

}
