package com.example.ecommerceproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerceproject.entity.Admin;

public interface AdminRepository  extends JpaRepository<Admin,Integer>{

}
