package com.example.shoppingcart.services.Impl;

import com.example.shoppingcart.common.exceptions.ResourceNotFoundException;
import com.example.shoppingcart.dtos.mapper.UserMapper;
import com.example.shoppingcart.dtos.requestDto.UserRequestDto;
import com.example.shoppingcart.dtos.responseDto.UserResponseDto;
import com.example.shoppingcart.models.UserEntity;
import com.example.shoppingcart.repositories.UserRepository;
import com.example.shoppingcart.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserResponseDto getUserById(Long userId) {
        UserEntity userEntity = userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User with id "+userId+" not found"));
        return UserMapper.userToUserResponseDto(userEntity);
    }

    @Override
    public UserResponseDto editUser(Long userId, UserRequestDto userRequestDto) {
        UserEntity user = userRepository.findById(userId).orElseThrow(()->
                new ResourceNotFoundException("User with id "+userId+" not found"));
        user.setPhone(userRequestDto.getPhone());
        user.setAvatar(userRequestDto.getAvatar());
        user.setName(userRequestDto.getName());
        user.setEmail(userRequestDto.getEmail());
        user.setAddress(userRequestDto.getAddress());
        return UserMapper.userToUserResponseDto(userRepository.save(user));
    }
}
