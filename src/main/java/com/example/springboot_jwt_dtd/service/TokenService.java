package com.example.springboot_jwt_dtd.service;

import com.example.springboot_jwt_dtd.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
