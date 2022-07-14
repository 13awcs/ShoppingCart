package com.example.shoppingcart.services;
import com.example.shoppingcart.dtos.responseDto.CategoryResponseDto;
import java.util.List;
public interface CategoryService {
    List<CategoryResponseDto> getCategories();

}
