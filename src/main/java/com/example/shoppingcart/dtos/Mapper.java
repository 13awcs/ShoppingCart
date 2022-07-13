package com.example.shoppingcart.dtos;

import com.example.shoppingcart.dtos.responseDto.CategoryResponseDto;
import com.example.shoppingcart.dtos.responseDto.ProductResponseDto;
import com.example.shoppingcart.dtos.responseDto.UserResponseDto;
import com.example.shoppingcart.models.CategoryEntity;
import com.example.shoppingcart.models.ProductEntity;
import com.example.shoppingcart.models.UserEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public static ProductResponseDto productToProductResponseDto(ProductEntity productEntity){
        ProductResponseDto productResponseDto = new ProductResponseDto();
        productResponseDto.setId(productEntity.getId());
        productResponseDto.setName(productEntity.getPro_name());
        productResponseDto.setAvatar(productEntity.getPro_avatar());
        productResponseDto.setNumber(productEntity.getPro_number());
        productResponseDto.setPrice(productEntity.getPro_price());
        productResponseDto.setAuthor_id(productEntity.getAdminEntity().getId());
        productResponseDto.setCreated_at(productEntity.getCreatedat());
        return productResponseDto;
    }
    public static List<ProductResponseDto> productsToProductResponseDto(List<ProductEntity> productEntities){
        List<ProductResponseDto> productResponseDtos = new ArrayList<>();
        for (ProductEntity productEntity : productEntities) {
            productResponseDtos.add(productToProductResponseDto(productEntity));
        }
        return productResponseDtos;
    }

    public static UserResponseDto userToUserResponseDto(UserEntity userEntity){
        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setId(userEntity.getId());
        userResponseDto.setPhone(userEntity.getPhone());
        userResponseDto.setAvatar(userEntity.getAvatar());
        userResponseDto.setName(userEntity.getName());
        userResponseDto.setEmail(userEntity.getEmail());
        userResponseDto.setAddress(userEntity.getAddress());
        return userResponseDto;

    }
}
