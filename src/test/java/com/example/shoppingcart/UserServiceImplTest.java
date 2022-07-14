package com.example.shoppingcart;

import com.example.shoppingcart.dtos.mapper.UserMapper;
import com.example.shoppingcart.dtos.requestDto.UserRequestDto;
import com.example.shoppingcart.dtos.responseDto.UserResponseDto;
import com.example.shoppingcart.repositories.UserRepository;
import com.example.shoppingcart.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UserServiceImplTest {
    @Autowired
    UserService userService;
    @Autowired
    UserRepository userRepository;
    @Test
    public void getUserById(){
        UserResponseDto user = new UserResponseDto(2L,"326128471","","bac","doanha18121999@gmail.com","");
        UserResponseDto userResponseDto = userService.getUserById(2L);
        assertEquals(user,userResponseDto);
    }

    @Test
    public void editUser(){
        UserRequestDto user = new UserRequestDto("2131231","gdfgd","dfgdfg","sdasd@gmail.com","hanoi");
        UserResponseDto userResponseDto = userService.editUser(1L,user);
        UserResponseDto userTest = UserMapper.userToUserResponseDto(userRepository.findById(1L).get());
        assertEquals(userResponseDto,userTest );
    }
}
