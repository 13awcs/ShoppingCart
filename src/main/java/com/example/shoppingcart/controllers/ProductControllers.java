package com.example.shoppingcart.controllers;

import com.example.shoppingcart.repositories.AdminsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductControllers {
    @Autowired
    AdminsRepository adminsRepository;

    @GetMapping ("delete")
    public String delete(){
        adminsRepository.deleteById(1);
        return "xoa thanh cong";
    }
}
