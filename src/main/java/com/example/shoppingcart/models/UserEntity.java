package com.example.shoppingcart.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String phone;
    private String avatar;
    private Integer active;
    private String password;
    private String name;
    private String email;
    private String address;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime created_at;
    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updated_at;

    @JsonBackReference
    @OneToOne(mappedBy = "userEntity",cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
    private OrderEntity orders;

    @JsonBackReference
    @OneToMany(mappedBy = "userEntity",cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
    private List<TransactionEntity> transactions;
}
