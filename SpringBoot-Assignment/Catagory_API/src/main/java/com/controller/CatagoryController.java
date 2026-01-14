package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.service.CatagoryService;

@RestController
public class CatagoryController {
		
	@Autowired
	CatagoryService srvs;
	
	@GetMapping("/age/{age}")
	public String catagory(@PathVariable int age) {
		return srvs.Catagory(age);
	}
}
