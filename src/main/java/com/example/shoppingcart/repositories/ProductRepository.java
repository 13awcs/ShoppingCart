package com.example.shoppingcart.repositories;

import com.example.shoppingcart.dtos.requestDto.CategoryRequestDto;
import com.example.shoppingcart.dtos.responseDto.ProductResponseDto;
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
    @Query(value = "SELECT * FROM products p WHERE " +
            "p.pro_name LIKE CONCAT('%',:query, '%')", nativeQuery = true)
    List<ProductEntity> searchProducts(String query);

    @Query(value = "SELECT * FROM products p WHERE p.pro_category_id = :id", nativeQuery = true)
    List<ProductEntity> getProductsByCategoryId(Long id);

    @Query(value = "Select * from products p where p.pro_category_id = :categoryId and p.pro_price between :min and :max ",nativeQuery = true)
    List<ProductEntity> getProductByRangePrice(Long categoryId,Integer min,Integer max);

}
