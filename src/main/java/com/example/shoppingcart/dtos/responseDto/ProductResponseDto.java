package com.example.shoppingcart.dtos.responseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
    private Long author_id;
    private Timestamp created_at;
}
