package com.example.shoppingcart.repositories;

import com.example.shoppingcart.models.Admins;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminsRepository extends JpaRepository<Admins,Integer> {
}
