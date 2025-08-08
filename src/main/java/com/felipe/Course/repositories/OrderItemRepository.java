package com.felipe.Course.repositories;
import org.springframework.data.jpa.repository.JpaRepository;


import com.felipe.Course.entities.OrderItem;



public interface OrderItemRepository extends JpaRepository<OrderItem, Long>  {
    
}
