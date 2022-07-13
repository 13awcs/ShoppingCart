package com.example.shoppingcart.services.Impl;

import com.example.shoppingcart.dtos.Mapper;
import com.example.shoppingcart.dtos.responseDto.UserResponseDto;
import com.example.shoppingcart.models.UserEntity;
import com.example.shoppingcart.repositories.UserRepository;
import com.example.shoppingcart.services.ProductService;
import com.example.shoppingcart.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity getUser(Long id) {
        UserEntity userEntity = userRepository.findById(id).orElseThrow(()->
                new IllegalStateException("User with id : "+ id + " could not be found"));
        return userEntity ;
    }

    @Override
    public UserResponseDto getUserById(Long id) {
        return Mapper.userToUserResponseDto(getUser(id));
    }
}
