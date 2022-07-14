package com.example.shoppingcart.services;

import com.example.shoppingcart.dtos.requestDto.UserRequestDto;
import com.example.shoppingcart.dtos.responseDto.UserResponseDto;
import com.example.shoppingcart.models.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    UserResponseDto getUserById(Long id);
    UserResponseDto editUser(Long userId, UserRequestDto userRequestDto);
}
