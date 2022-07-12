package com.example.shoppingcart.dtos.responseDto;

import lombok.Data;

@Data
public class ProductResponseDto {
    private Long id;
    private String name;
    private String avatar;
    private Integer number;
    private Float price;
    private Long author_id;
}
