package com.felipe.Course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipe.Course.entities.Product;
import com.felipe.Course.repositories.ProductRepository;
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    
    public List<Product> findAll() {
        return productRepository.findAll();
    }
    public Product findByid(Long id){
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();

    }
}
