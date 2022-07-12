package com.example.shoppingcart;

import com.example.shoppingcart.dtos.responseDto.CategoryResponseDto;
import com.example.shoppingcart.repositories.CategoryRepository;
import com.example.shoppingcart.services.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    CategoryService categoryService;

    @Autowired
    CategoryRepository categoryRepository;

    @Test
    public void getCategoriesTest(){
        //List<CategoryResponseDto> category = new ArrayList<>();
        CategoryResponseDto categoryResponseDto =new CategoryResponseDto(1L,"Giay");
        //category.add(1,categoryResponseDto);

        List<CategoryResponseDto> categoryEntities = categoryService.getCategories();
        assertEquals(categoryResponseDto,categoryEntities.get(0));


    }
}
