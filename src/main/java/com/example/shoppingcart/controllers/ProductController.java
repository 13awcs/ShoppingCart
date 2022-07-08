package com.example.shoppingcart.controllers;

import com.example.shoppingcart.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    AdminRepository adminRepository;

    @GetMapping ("delete")
    public String delete(){
        adminRepository.deleteById(1);
        return "xoa thanh cong";
    }
}
