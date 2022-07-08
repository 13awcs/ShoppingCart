package com.example.shoppingcart.services.Impl;

import com.example.shoppingcart.models.AdminEntity;
import com.example.shoppingcart.repositories.AdminRepository;
import com.example.shoppingcart.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminRepository adminRepository;

    @Override
    public List<AdminEntity> findAll() {
        return adminRepository.findAll();
    }
}
