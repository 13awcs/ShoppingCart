package com.example.shoppingcart.services.Impl;

import com.example.shoppingcart.common.exceptions.BadRequestException;
import com.example.shoppingcart.common.exceptions.ResourceNotFoundException;
import com.example.shoppingcart.dtos.mapper.ProductMapper;
import com.example.shoppingcart.dtos.responseDto.ProductResponseDto;
import com.example.shoppingcart.models.ProductEntity;
import com.example.shoppingcart.repositories.CategoryRepository;
import com.example.shoppingcart.repositories.ProductRepository;
import com.example.shoppingcart.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CategoryRepository categoryRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductResponseDto> getNewestProduct(String field, int topNumber) {
        List<ProductEntity> productEntities = productRepository.findAll(Sort.by(Sort.Direction.DESC,field));
        List<ProductEntity> listTopProducts = new ArrayList<>();
        int count = 0;
        for (ProductEntity productEntity : productEntities) {
            listTopProducts.add(productEntity);
            count++;
            if(count == topNumber){
                break;
            }
        }
        return ProductMapper.productsToProductResponseDto(listTopProducts);

    }

    @Override
    public List<ProductResponseDto> getAllProduct() {
        List<ProductEntity> products = productRepository.findAll();
        return ProductMapper.productsToProductResponseDto(products);
    }

    @Override
    public List<ProductResponseDto> searchProducts(String query) {
        List<ProductEntity> products = productRepository.searchProducts(query);
        return ProductMapper.productsToProductResponseDto(products);
    }

    @Override
    public List<ProductResponseDto> getProductsByCategoryId(Long categoryId) {
        List<ProductEntity> products = productRepository.getProductsByCategoryId(categoryId);
        return ProductMapper.productsToProductResponseDto(products);
    }

    @Override
    public ProductResponseDto getProductById(Long productId) {
        return ProductMapper.productToProductResponseDto(productRepository.findById(productId).orElseThrow(()->
                new ResourceNotFoundException("Product with id "+productId+" not found")));
    }

    @Override
    public List<ProductResponseDto> getProductByRangePrice(Long categoryId,Integer min, Integer max) {
        Boolean exits = categoryRepository.existsById(categoryId);
        if(!exits){
            throw new ResourceNotFoundException("Category with id "+categoryId+ " not found");

        }
        if(min>=max) throw new BadRequestException("Min should be smaller than Max");

        List<ProductEntity> products = productRepository.getProductByRangePrice(categoryId,min,max);
        return ProductMapper.productsToProductResponseDto(products);
    }

    @Override
    public List<ProductResponseDto> getProductsByDate(Long categoryId, String dateProduct) {
        List<ProductEntity> products = productRepository.getProductByDate(categoryId,dateProduct);
        return ProductMapper.productsToProductResponseDto(products);
    }

    @Override
    public List<ProductResponseDto> getNewestProductsByCategoryId(Long categoryId) {
        List<ProductEntity> products = productRepository.getNewestProductsByCategoryId(categoryId);
        return ProductMapper.productsToProductResponseDto(products);
    }

}

