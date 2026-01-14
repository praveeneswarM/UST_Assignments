package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.service.ReverseService;

@RestController
public class ReverseController {
	
	@Autowired
	ReverseService srvs;
	
	@GetMapping(value="/reverse/{text}",produces=MediaType.TEXT_PLAIN_VALUE)
	public String reverse(@PathVariable String text) {
		return srvs.reverseString(text);
	}
}
