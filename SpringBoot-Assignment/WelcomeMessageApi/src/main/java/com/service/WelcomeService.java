package com.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
	public String greet() {
		return "Welcome to Spring Boot REST API";
	}
}
