package com.example.shoppingcart.repositories;

import com.example.shoppingcart.dtos.responseDto.ProductResponseDto;
import com.example.shoppingcart.models.OrderItemEntity;
import com.example.shoppingcart.models.OrderItemKey;
import com.example.shoppingcart.models.ProductEntity;
import com.example.shoppingcart.repositories.jpaObjecty.TopNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItemEntity, OrderItemKey> {

    @Query(nativeQuery = true, value = "select o.id.product_id from order_item o")
    List<OrderItemEntity> getAll();
    @Query(nativeQuery = true, value = "select top :topNumber od.product_id as productId,p.pro_name as productName,p.pro_avatar as avatar," +
            "p.pro_number as number,p.pro_price as price,p.pro_author_id as authorId,p.pro_category_id as categoryId,p.created_at as createdAt, sum(order_item_quantity) as quantity " +
            "from products p join order_item od on p.id = od.product_id group by od.product_id order by sum(order_item_quantity) DESC")
    List<TopNumber> findTop(int topNumber);

    @Query(nativeQuery = true, value = "select top :topNumber od.product_id as productId,p.pro_name as productName,p.pro_avatar as avatar," +
            "p.pro_number as number,p.pro_price as price,p.pro_author_id as authorId,p.created_at as createdAt,p.pro_category_id as categoryId,sum(order_item_quantity) as quantity " +
            "from products p join order_item od on p.id = od.product_id where p.pro_category_id = :categoryId group by od.product_id order by sum(order_item_quantity) DESC")
    List<TopNumber> findTopByCategory(int topNumber,Long categoryId);
}
