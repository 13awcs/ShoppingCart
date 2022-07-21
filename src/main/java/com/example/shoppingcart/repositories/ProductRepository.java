package com.example.shoppingcart.repositories;

import com.example.shoppingcart.dtos.requestDto.CategoryRequestDto;
import com.example.shoppingcart.dtos.responseDto.ProductResponseDto;
import com.example.shoppingcart.models.ProductEntity;
import org.hibernate.criterion.Order;
import org.hibernate.query.NativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Queue;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
    @Query(value = "SELECT * FROM products p WHERE " +
            "p.pro_name LIKE CONCAT('%',:query, '%')", nativeQuery = true)
    List<ProductEntity> searchProductsByName(String query);

    @Query(value = "SELECT * FROM products p WHERE p.pro_category_id = :id", nativeQuery = true)
    List<ProductEntity> getProductsByCategoryId(Long id);

    @Query(value = "Select * from products p where p.pro_category_id = :categoryId and p.pro_price between :min and :max ",nativeQuery = true)
    List<ProductEntity> getProductByRangePrice(Long categoryId,Integer min,Integer max);

    @Query(value = "Select * from products where pro_category_id = :categoryId and created_at = :dateProduct",nativeQuery = true)
    List<ProductEntity> getProductByDate(Long categoryId,String dateProduct);

    @Query( "SELECT u.id.productId FROM OrderItemEntity u GROUP BY u.id.productId ORDER BY SUM(u.orderItemQuantity) DESC")
    List<ProductEntity> getTopProduct();
    @Query( value = "SELECT * FROM PRODUCTS WHERE PRO_CATEGORY_ID = 3 ORDER BY CREATED_AT DESC",nativeQuery = true)
    List<ProductEntity> getNewestProductsByCategoryId(Long categoryId);



}
