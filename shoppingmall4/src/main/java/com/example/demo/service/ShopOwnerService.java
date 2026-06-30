package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ShopOwner;
import com.example.demo.repository.ShopOwnerRepository;

@Service
public class ShopOwnerService {

    @Autowired
    private ShopOwnerRepository repository;

    public ShopOwner saveOwner(ShopOwner owner) {
        return repository.save(owner);
    }

    public List<ShopOwner> getAllOwners() {
        return repository.findAll();
    }

    public ShopOwner getOwnerById(int id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteOwner(int id) {
        repository.deleteById(id);
    }
}