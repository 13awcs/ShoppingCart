package com.example.shoppingcart.dtos;

import com.example.shoppingcart.dtos.responseDto.CategoryResponseDto;
import com.example.shoppingcart.models.CategoryEntity;

import java.util.ArrayList;
import java.util.List;

public class Mapper {
    public static CategoryResponseDto categoryToCategoryResponseDto(CategoryEntity categoryEntity){
        CategoryResponseDto categoryResponseDto = new CategoryResponseDto();
        categoryResponseDto.setId(categoryEntity.getId());
        categoryResponseDto.setName(categoryEntity.getC_name());
        return categoryResponseDto;
    }

    public static List<CategoryResponseDto> categoriesToCategoryResponseDto(List<CategoryEntity> categoryEntities){
        List<CategoryResponseDto> categoryResponseDtos = new ArrayList<>();
        for(CategoryEntity categoryEntity : categoryEntities){
            categoryResponseDtos.add(categoryToCategoryResponseDto(categoryEntity));
        }
        return categoryResponseDtos;
    }
}
