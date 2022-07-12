package com.example.shoppingcart.repositories;

import com.example.shoppingcart.models.Order_itemEntity;
import com.example.shoppingcart.models.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Order_itemRepository extends JpaRepository<Order_itemEntity,Long> {

    @Query(nativeQuery = true, value = "SELECT TOP ?1  u.product_id,SUM( u.order_item_quantity) FROM Order_itemEntity u GROUP BY u.product_id ORDER BY SUM(u.order_item_quantity) DESC")
    List<Order_itemEntity> findTop(int topNumber);


}
