package com.user_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user_service.entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {
	
	public User findByUserId(int userId);

}
