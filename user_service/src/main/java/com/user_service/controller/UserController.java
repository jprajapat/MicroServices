package com.user_service.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user_service.entity.User;
import com.user_service.helper.ResponceTemplete;
import com.user_service.requestdto.UserRequestDto;
import com.user_service.services.UserService;


@RestController
@RequestMapping("user_service")
public class UserController {
	
	@Autowired private UserService userService;
	
	@GetMapping("/getUserById/{id}")
	public Optional<User> getUserById(@PathVariable("id") int userId) {
		return userService.getUserById(userId);
		
	}
	
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody UserRequestDto userRequestDto) {
		User user = new User();
		user.setName(userRequestDto.getName());
		user.setPhone(userRequestDto.getPhone());
		user.setCId(userRequestDto.getContactId());
		
		
		return userService.saveUser(user);
		
	}
	
	@GetMapping("/getUser/{id}")
	public ResponceTemplete getUserAndDepartment(@PathVariable("id") int userId) {
		return userService.getUserAndDepartment(userId);
		
	}

}
