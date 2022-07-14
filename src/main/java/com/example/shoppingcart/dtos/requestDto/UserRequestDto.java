package com.example.shoppingcart.dtos.requestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class UserRequestDto {
    private String phone;
    private String avatar;
    private String name;
    private String email;
    private String address;
}
