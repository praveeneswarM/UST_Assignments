package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	LoginService srvs;
	
	@PostMapping(value="login",produces=MediaType.TEXT_PLAIN_VALUE)
	public String login(@RequestParam String email, @RequestParam String password) {
		return srvs.login(email, password);
	}
}
