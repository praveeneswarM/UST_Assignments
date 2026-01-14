package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.WelcomeService;

@RestController
public class WelcomeController {
	@Autowired
	WelcomeService srvs;
	
	@GetMapping(value="/welcome",produces=MediaType.TEXT_PLAIN_VALUE)
	public String greet() {
		return srvs.greet();
	}
}
