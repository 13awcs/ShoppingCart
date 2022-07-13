package com.example.shoppingcart.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {
    private Long id;
    private String c_name;
    private String c_icon;
    private String c_avatar;
    private Integer c_active;
    private Long c_author_id;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
