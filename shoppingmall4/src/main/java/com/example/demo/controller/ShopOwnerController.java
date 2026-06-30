package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.ShopOwner;
import com.example.demo.service.ShopOwnerService;

@RestController
@RequestMapping("/owner")
public class ShopOwnerController {

    @Autowired
    private ShopOwnerService service;

    @PostMapping
    public ShopOwner saveOwner(@RequestBody ShopOwner owner) {
        return service.saveOwner(owner);
    }

    @GetMapping
    public List<ShopOwner> getAllOwners() {
        return service.getAllOwners();
    }

    @GetMapping("/{id}")
    public ShopOwner getOwnerById(@PathVariable int id) {
        return service.getOwnerById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteOwner(@PathVariable int id) {
        service.deleteOwner(id);
        return "Deleted Successfully";
    }
}