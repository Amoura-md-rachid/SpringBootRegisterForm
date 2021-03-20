package com.Register.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.Register.model.User;
import com.Register.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
