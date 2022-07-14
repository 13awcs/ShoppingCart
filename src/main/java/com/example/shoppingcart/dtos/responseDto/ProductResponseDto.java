package com.example.shoppingcart.dtos.responseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductResponseDto {
    private Long id;
    private String name;
    private String avatar;
    private Integer number;
    private Integer price;
    private Long authorId;
    private Timestamp createAt;
}
