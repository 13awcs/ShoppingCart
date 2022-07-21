package com.example.shoppingcart.test;

import com.example.shoppingcart.common.exceptions.GlobalExceptionHandler;
import com.example.shoppingcart.common.exceptions.ResourceNotFoundException;
import com.example.shoppingcart.dtos.mapper.UserMapper;
import com.example.shoppingcart.dtos.requestDto.UserRequestDto;
import com.example.shoppingcart.dtos.responseDto.UserResponseDto;
import com.example.shoppingcart.repositories.UserRepository;
import com.example.shoppingcart.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class UserServiceImplTest {
    @Autowired
    UserService userService;
    @Autowired
    UserRepository userRepository;

    @Autowired
    GlobalExceptionHandler globalExceptionHandler;
    @Test
    public void getUserById(){
        UserResponseDto user = new UserResponseDto(2L,"326128471","","bac","doanha18121999@gmail.com","");
        UserResponseDto userResponseDto = userService.getUserById(2L);
        assertEquals(user,userResponseDto);
    }

    @Test
    public void JUnitTestGetUserByIdTest(){
        HttpStatus status = HttpStatus.NOT_FOUND;
        ResourceNotFoundException exception = assertThrows(ResourceNotFoundException.class, () -> {
            userService.getUserById(100L);
        });
        ResponseEntity<?> errorResponse = globalExceptionHandler.handleResourceNotFoundException(exception) ;
        ResourceNotFoundException notFoundException = new ResourceNotFoundException("User with id 100 not found");
        assertEquals(exception.getMessage(), notFoundException.getMessage());
        assertEquals(status, errorResponse.getStatusCode());

    }


    @Test
    public void editUser(){
        UserRequestDto user = new UserRequestDto("2131231","gdfgd","dfgdfg","sdasd@gmail.com","hanoi");
        UserResponseDto userResponseDto = userService.editUser(1L,user);
        UserResponseDto userTest = UserMapper.userToUserResponseDto(userRepository.findById(1L).get());
        assertEquals(userResponseDto,userTest );
    }

    @Test
    public void JUnitEditUserTest(){
        UserRequestDto user = new UserRequestDto("2131231","gdfgd","dfgdfg","sdasd@gmail.com","hanoi");
        HttpStatus status = HttpStatus.NOT_FOUND;
        ResourceNotFoundException exception = assertThrows(ResourceNotFoundException.class, () -> {
            userService.editUser(100L,user);
        });
        ResponseEntity<?> errorResponse = globalExceptionHandler.handleResourceNotFoundException(exception) ;
        ResourceNotFoundException notFoundException = new ResourceNotFoundException("User with id 100 not found");
        assertEquals(exception.getMessage(), notFoundException.getMessage());
        assertEquals(status, errorResponse.getStatusCode());

    }
}
