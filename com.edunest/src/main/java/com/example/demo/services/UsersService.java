package com.example.demo.services;

import com.example.demo.entity.Users;

public interface UsersService {
	String addUser(Users user);

	boolean checkEmail(String email);

	boolean validate(String email, String password);

	String getUserRole(String email);

	Users getUser(String email);
	
	String updateUser(Users user);
	}
