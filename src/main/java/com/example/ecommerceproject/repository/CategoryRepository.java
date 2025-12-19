package com.example.ecommerceproject.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerceproject.entity.ProductCategory;


public interface CategoryRepository extends JpaRepository<ProductCategory,Integer>{

}
