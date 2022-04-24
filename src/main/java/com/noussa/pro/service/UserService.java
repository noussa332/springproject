package com.noussa.pro.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.noussa.pro.dto.UserRegistrationDto;
import com.noussa.pro.model.User;



public interface UserService extends UserDetailsService{
	
	User save(UserRegistrationDto registrationDto);

}
