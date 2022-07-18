package com.example.shoppingcart.services;

import com.example.shoppingcart.dtos.requestDto.CategoryRequestDto;
import com.example.shoppingcart.dtos.responseDto.ProductResponseDto;
import com.example.shoppingcart.models.CategoryEntity;
import com.example.shoppingcart.models.ProductEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

public interface ProductService {

    List<ProductResponseDto> getNewestProduct(String field, int topNumber);
    List<ProductResponseDto> getAllProduct();
    List<ProductResponseDto> searchProducts(String query);
    List<ProductResponseDto> getProductsByCategoryId(Long categoryId);
    ProductResponseDto getProductById(Long productId);
    List<ProductResponseDto> getProductByRangePrice(Long categoryId,Integer min,Integer max);
    List<ProductResponseDto> getProductsByDate(Long categoryId, String dateProduct);
    List<ProductResponseDto> getNewestProductsByCategoryId(Long categoryId);


}
