package com.example.springboot_jwt_dtd.service.impl;

import com.example.springboot_jwt_dtd.entity.User;
import com.example.springboot_jwt_dtd.repository.UserRepository;
import com.example.springboot_jwt_dtd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.saveAndFlush(user);
    }
}
