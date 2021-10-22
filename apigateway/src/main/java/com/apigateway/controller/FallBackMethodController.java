package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
	
	@GetMapping("/userServiceFallBack")
	public String userServiceFallBack() {
		return "user service in something went wrong, please try again later";
	}
	
	@GetMapping("/contactServiceFallBack")
	public String contactServiceFallBack() {
		return "contact service in something went wrong, please try again later";
	}

}
