package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.CountService;

@RestController
public class CountController {
	
	@Autowired
	CountService srvs;
	
	@PostMapping("/wordcount")
	public int count(@RequestParam String text) {
		return srvs.count(text);
	}
}
