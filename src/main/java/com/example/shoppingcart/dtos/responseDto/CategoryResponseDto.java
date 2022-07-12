package com.example.shoppingcart.dtos.responseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Tolerate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CategoryResponseDto {
    private Long id;
    private String name;
}
