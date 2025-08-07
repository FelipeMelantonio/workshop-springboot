package com.felipe.Course.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.Course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>  {
    
}
