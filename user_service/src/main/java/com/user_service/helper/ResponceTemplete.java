package com.user_service.helper;

import com.user_service.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponceTemplete {
	
	private User user;
	private Contact contact;

}
