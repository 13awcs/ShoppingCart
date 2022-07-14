package com.example.shoppingcart.dtos.responseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDto {
    private Long id;
    private String phone;
    private String avatar;
    private String name;
    private String email;
    private String address;
}
