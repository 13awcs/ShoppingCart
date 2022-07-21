package com.example.shoppingcart.test;

import com.example.shoppingcart.common.exceptions.BadRequestException;
import com.example.shoppingcart.common.exceptions.GlobalExceptionHandler;
import com.example.shoppingcart.common.exceptions.ResourceNotFoundException;
import com.example.shoppingcart.dtos.mapper.ProductMapper;
import com.example.shoppingcart.dtos.responseDto.ProductResponseDto;
import com.example.shoppingcart.models.ProductEntity;
import com.example.shoppingcart.repositories.ProductRepository;
import com.example.shoppingcart.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    ProductService productService;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    GlobalExceptionHandler globalExceptionHandler;
    @Test
    public void getProductsByDate(){
        List<ProductEntity> product = productRepository.getProductByDate(3L,"2022-07-15");
        List<ProductResponseDto> products = productService.getProductsByDate(3L,"2022-07-15");
        assertEquals(ProductMapper.productsToProductResponseDto(product),products);
    }
    @Test
    public void JUnitTestGetProductsByDate(){
        HttpStatus status = HttpStatus.NOT_FOUND;
        ResourceNotFoundException exception = assertThrows(ResourceNotFoundException.class, () -> {
            productService.getProductsByDate(100L,"2022-07-15");
        });
        ResponseEntity<?> errorResponse = globalExceptionHandler.handleResourceNotFoundException(exception) ;
        ResourceNotFoundException notFoundException = new ResourceNotFoundException("Category with id 100 not found");
        assertEquals(exception.getMessage(), notFoundException.getMessage());
        assertEquals(status, errorResponse.getStatusCode());
    }

    @Test
    public void getNewestProducts(){
        List<ProductEntity> products = productRepository.getNewestProductsByCategoryId(3L);
        List<ProductResponseDto> productResponseDtoList = productService.getNewestProductsByCategoryId(3L);
        assertEquals(ProductMapper.productsToProductResponseDto(products),productResponseDtoList);
    }
    @Test
    public void JUnitTestGetProductsByCategoryId(){
        HttpStatus status = HttpStatus.NOT_FOUND;
        ResourceNotFoundException exception = assertThrows(ResourceNotFoundException.class, () -> {
            productService.getProductsByCategoryId(100L);
        });
        ResponseEntity<?> errorResponse = globalExceptionHandler.handleResourceNotFoundException(exception) ;
        ResourceNotFoundException notFoundException = new ResourceNotFoundException("Category with id 100 not found");
        assertEquals(exception.getMessage(), notFoundException.getMessage());
        assertEquals(status, errorResponse.getStatusCode());
    }
    @Test
    public void JUnitTestGetProductsById(){
        HttpStatus status = HttpStatus.NOT_FOUND;
        ResourceNotFoundException exception = assertThrows(ResourceNotFoundException.class, () -> {
            productService.getProductById(100L);
        });
        ResponseEntity<?> errorResponse = globalExceptionHandler.handleResourceNotFoundException(exception) ;
        ResourceNotFoundException notFoundException = new ResourceNotFoundException("Product with id 100 not found");
        assertEquals(exception.getMessage(), notFoundException.getMessage());
        assertEquals(status, errorResponse.getStatusCode());
    }
    @Test
    public void JUnitTestGetProductsByRangePrice(){
        HttpStatus status = HttpStatus.NOT_FOUND;
        ResourceNotFoundException exception = assertThrows(ResourceNotFoundException.class, () -> {
            productService.getProductByRangePrice(100L,5,10);
        });
        ResponseEntity<?> errorResponse = globalExceptionHandler.handleResourceNotFoundException(exception) ;
        ResourceNotFoundException notFoundException = new ResourceNotFoundException("Category with id 100 not found");
        assertEquals(exception.getMessage(), notFoundException.getMessage());
        assertEquals(status, errorResponse.getStatusCode());

        HttpStatus statusBadRequest = HttpStatus.BAD_REQUEST;
        BadRequestException badRequestException = assertThrows(BadRequestException.class, () -> {
            productService.getProductByRangePrice(1L,10,5);
        });
        ResponseEntity<?> response = globalExceptionHandler.handleBadRequestException(badRequestException) ;
        BadRequestException badRequest = new BadRequestException("Min should be smaller than Max");
        assertEquals(badRequestException.getMessage(), badRequest.getMessage());
        assertEquals(statusBadRequest, response.getStatusCode());
    }

}
