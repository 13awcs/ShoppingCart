package com.example.shoppingcart.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transactions")
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tr_total")
    private Integer total;

    @Column(name = "tr_note")
    private String note;

    @Column(name = "tr_address")
    private String address;

    @Column(name = "tr_phone")
    private String phone;

    @Column(name = "tr_status")
    private Integer status;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createAt;
    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updateAt;

    @ManyToOne
    @JoinColumn(name = "tr_user_id")
    private UserEntity userEntity;

    @JsonBackReference
    @OneToMany(mappedBy = "transactionEntity",cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
    private List<OrderEntity> orders;
}
