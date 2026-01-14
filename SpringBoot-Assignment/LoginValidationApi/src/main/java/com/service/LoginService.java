package com.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public String login(String email,String password) {
		if(email.equalsIgnoreCase("admin") && password.equals("admin123"))
			return "Success";
		return "Failure";
	}
}
