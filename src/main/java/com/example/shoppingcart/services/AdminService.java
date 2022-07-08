package com.example.shoppingcart.services;

import com.example.shoppingcart.models.AdminEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {
    List<AdminEntity> findAll();
}
