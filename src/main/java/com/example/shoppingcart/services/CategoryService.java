package com.example.shoppingcart.services;

import com.example.shoppingcart.common.ResponseObject;
import com.example.shoppingcart.dtos.responseDto.CategoryResponseDto;
import com.example.shoppingcart.models.CategoryEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CategoryService {

    List<CategoryResponseDto> getCategories();

}
