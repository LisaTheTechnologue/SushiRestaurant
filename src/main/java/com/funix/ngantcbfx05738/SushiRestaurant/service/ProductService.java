/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.funix.ngantcbfx05738.SushiRestaurant.service;

import com.funix.ngantcbfx05738.SushiRestaurant.model.Product;
import com.funix.ngantcbfx05738.SushiRestaurant.repo.ProductRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author baong
 */
@Service
public class ProductService {
    
    @Autowired
    private final ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }    
    
    public List<Product> getAllProducts() {
        List<Product> products = productRepo.findAll();
        return products;
    }
}
