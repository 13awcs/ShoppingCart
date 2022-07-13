package com.example.shoppingcart.dtos.responseDto;

import com.example.shoppingcart.models.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Tolerate;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CategoryResponseDto {
    private Long id;
    private String name;
}