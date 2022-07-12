package com.example.shoppingcart.services.Impl;

import com.example.shoppingcart.common.ResponseObject;
import com.example.shoppingcart.dtos.Mapper;
import com.example.shoppingcart.dtos.responseDto.CategoryResponseDto;
import com.example.shoppingcart.models.CategoryEntity;
import com.example.shoppingcart.repositories.CategoryRepository;
import com.example.shoppingcart.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryResponseDto> getCategories() {
        List<CategoryEntity> categories;
        categories = categoryRepository.findAll();
        return Mapper.categoriesToCategoryResponseDto(categories);

    }

}
