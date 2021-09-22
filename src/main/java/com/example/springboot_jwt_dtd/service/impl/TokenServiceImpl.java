package com.example.springboot_jwt_dtd.service.impl;

import com.example.springboot_jwt_dtd.entity.Token;
import com.example.springboot_jwt_dtd.repository.TokenRepository;
import com.example.springboot_jwt_dtd.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl implements TokenService {

    @Autowired
    private TokenRepository tokenRepository;

    @Override
    public Token createToken(Token token) {
        return tokenRepository.saveAndFlush(token) ;
    }

    @Override
    public Token findByToken(String token) {
        return tokenRepository.findByToken(token);
    }
}
