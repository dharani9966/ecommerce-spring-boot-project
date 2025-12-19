package com.example.ecommerceproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerceproject.entity.Admin;
import com.example.ecommerceproject.repository.AdminRepository;

@Service
public class AdminService {
    @Autowired
    private AdminRepository arepo;

    public void save(Admin a){
        arepo.save(a);

    }
    public List<Admin>fetchAll(){
        return arepo.findAll();
    }


}
