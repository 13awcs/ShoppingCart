package com.example.shoppingcart.repositories;

import com.example.shoppingcart.models.ProductEntity;
import org.hibernate.criterion.Order;
import org.hibernate.query.NativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Queue;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Long> {

}
