package com.felipe.Course.repositories;
import org.springframework.data.jpa.repository.JpaRepository;


import com.felipe.Course.entities.Product;



public interface ProductRepository extends JpaRepository<Product, Long>  {
    
}
