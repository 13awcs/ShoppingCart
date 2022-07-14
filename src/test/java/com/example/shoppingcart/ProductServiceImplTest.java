package com.example.shoppingcart;

import com.example.shoppingcart.dtos.responseDto.ProductResponseDto;
import com.example.shoppingcart.models.CategoryEntity;
import com.example.shoppingcart.models.ProductEntity;
import com.example.shoppingcart.repositories.ProductRepository;
import com.example.shoppingcart.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    ProductService productService;
//
//    @Test
//    public void getProductsByCategoryId(){
//        ProductResponseDto product = new ProductResponseDto(3L,"Giay trang",3L,"",150,150000,3L,LocalDate.now());
//        List<ProductResponseDto> products = productService.getProductsByCategoryId(3L);
//        assertEquals(product,products.get(0));
//
//    }

}
