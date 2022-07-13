package com.example.shoppingcart.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private Long id;
    private String pro_name;
    private Long pro_category_id;
    private Integer pro_price;
    private Long pro_author_id;
    private Integer active;
    private Integer pro_number;
    private String pro_description;
    private String pro_avatar;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
