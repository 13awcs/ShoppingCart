package com.example.shoppingcart.services;

import com.example.shoppingcart.dtos.responseDto.UserResponseDto;
import com.example.shoppingcart.models.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    UserEntity getUser(Long id);
    UserResponseDto getUserById(Long id);


}
