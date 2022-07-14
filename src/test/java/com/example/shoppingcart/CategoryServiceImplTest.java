package com.example.shoppingcart;

import com.example.shoppingcart.dtos.responseDto.CategoryResponseDto;
import com.example.shoppingcart.services.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CategoryServiceImplTest {
    @Autowired
    CategoryService categoryService;
    @Test
    public void getCategoriesTest(){
        CategoryResponseDto categoryResponseDto = new CategoryResponseDto(1L,"Giay");
        List<CategoryResponseDto> categoryEntities = categoryService.getCategories();
        assertEquals(categoryResponseDto,categoryEntities.get(0));
    }
}
