package com.felipe.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.felipe.Course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}