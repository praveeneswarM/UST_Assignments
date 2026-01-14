package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.MaxService;

@RestController
public class MaxController {
	
	@Autowired
	MaxService srvs;
	
	@GetMapping("/max")
	public int max(@RequestParam int a,@RequestParam int b,@RequestParam int c)
	{
		return srvs.max(a, b, c);
	}
}
