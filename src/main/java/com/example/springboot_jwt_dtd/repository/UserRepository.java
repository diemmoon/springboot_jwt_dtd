package com.example.springboot_jwt_dtd.repository;

import com.example.springboot_jwt_dtd.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
