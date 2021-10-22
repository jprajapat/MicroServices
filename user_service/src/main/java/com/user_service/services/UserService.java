package com.user_service.services;

import java.util.Optional;

import com.user_service.entity.User;
import com.user_service.helper.ResponceTemplete;

public interface UserService {
	
	public User saveUser(User user);
	public Optional<User> getUserById(int userId);
	public ResponceTemplete getUserAndDepartment(int userId);
	

}
