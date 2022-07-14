package com.example.shoppingcart.dtos.mapper;

import com.example.shoppingcart.dtos.responseDto.UserResponseDto;
import com.example.shoppingcart.models.UserEntity;
public class UserMapper {
    public static UserResponseDto userToUserResponseDto(UserEntity userEntity){
        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setId(userEntity.getId());
        userResponseDto.setPhone(userEntity.getPhone());
        userResponseDto.setAvatar(userEntity.getAvatar());
        userResponseDto.setName(userEntity.getName());
        userResponseDto.setEmail(userEntity.getEmail());
        userResponseDto.setAddress(userEntity.getAddress());
        return userResponseDto;

    }
}
