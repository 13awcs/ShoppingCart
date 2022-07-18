package com.example.shoppingcart;

import com.example.shoppingcart.dtos.mapper.ProductMapper;
import com.example.shoppingcart.dtos.responseDto.ProductResponseDto;
import com.example.shoppingcart.models.ProductEntity;
import com.example.shoppingcart.repositories.ProductRepository;
import com.example.shoppingcart.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    ProductService productService;
    @Autowired
    ProductRepository productRepository;

    @Test
    public void getProductsByDate(){
        List<ProductEntity> product = productRepository.getProductByDate(3L,"2022-07-15");
        List<ProductResponseDto> products = productService.getProductsByDate(3L,"2022-07-15");
        assertEquals(ProductMapper.productsToProductResponseDto(product),products);
    }

    @Test
    public void getNewestProducts(){
        List<ProductEntity> products = productRepository.getNewestProductsByCategoryId(3L);
        List<ProductResponseDto> productResponseDtoList = productService.getNewestProductsByCategoryId(3L);
        assertEquals(ProductMapper.productsToProductResponseDto(products),productResponseDtoList);
    }

}
