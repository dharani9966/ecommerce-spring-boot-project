package com.example.ecommerceproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerceproject.entity.ProductCategory;
import com.example.ecommerceproject.repository.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository crepo;

    public void saveCategory(ProductCategory c){
        crepo.save(c);
    }

    public List<ProductCategory> getAll(){

        return crepo.findAll();

    }
    public void deleteById(int id){
        crepo. deleteById(id);
    }
    public Optional<ProductCategory>fetchById(int id){

         return crepo.findById(id);

    }
    
 
}
