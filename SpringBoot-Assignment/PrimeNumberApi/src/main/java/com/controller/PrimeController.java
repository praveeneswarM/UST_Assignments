package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.service.PrimeService;

@RestController
public class PrimeController {
	
	@Autowired
	PrimeService srvs;
	
	@GetMapping(value="prime/{num}",produces=MediaType.TEXT_PLAIN_VALUE)
	public String prime(@PathVariable int num) {
		return srvs.prime(num);
	}
}
