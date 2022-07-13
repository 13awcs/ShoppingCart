package com.example.shoppingcart.services.Impl;

import com.example.shoppingcart.dtos.Mapper;
import com.example.shoppingcart.dtos.responseDto.CategoryResponseDto;
import com.example.shoppingcart.models.CategoryEntity;
import com.example.shoppingcart.repositories.CategoryRepository;
import com.example.shoppingcart.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

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
        List<CategoryEntity> categories = categoryRepository.findAll();
        return Mapper.categoriesToCategoryResponseDto(categories);

    }


}
