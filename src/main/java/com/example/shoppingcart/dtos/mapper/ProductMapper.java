package com.example.shoppingcart.dtos.mapper;
import com.example.shoppingcart.dtos.responseDto.ProductResponseDto;
import com.example.shoppingcart.models.ProductEntity;
import java.util.ArrayList;
import java.util.List;
public class ProductMapper {
    public static ProductResponseDto productToProductResponseDto(ProductEntity productEntity){
        ProductResponseDto productResponseDto = new ProductResponseDto();
        productResponseDto.setId(productEntity.getId());
        productResponseDto.setName(productEntity.getName());
        productResponseDto.setAvatar(productEntity.getAvatar());
        productResponseDto.setNumber(productEntity.getNumber());
        productResponseDto.setPrice(productEntity.getPrice());
        productResponseDto.setAuthorId(productEntity.getAdminEntity().getId());
        productResponseDto.setCreateAt(productEntity.getCreatedAt());
        return productResponseDto;
    }
    public static List<ProductResponseDto> productsToProductResponseDto(List<ProductEntity> productEntities){
        List<ProductResponseDto> productResponseDtos = new ArrayList<>();
        for (ProductEntity productEntity : productEntities) {
            productResponseDtos.add(productToProductResponseDto(productEntity));
        }
        return productResponseDtos;
    }


}
