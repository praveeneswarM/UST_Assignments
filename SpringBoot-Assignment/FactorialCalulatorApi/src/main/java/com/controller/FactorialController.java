package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.service.FactorialService;

@RestController
public class FactorialController {
	
	@Autowired
	FactorialService srvs;
	
	@GetMapping("/factorial/{num}")
	public int fact(@PathVariable int num) {
		return srvs.fact(num);
	}
}
