package com.example.springboot_jwt_dtd.repository;

import com.example.springboot_jwt_dtd.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
