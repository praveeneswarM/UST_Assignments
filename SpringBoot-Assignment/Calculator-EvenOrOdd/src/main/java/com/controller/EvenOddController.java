package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.service.EvenOddService;

@RestController
public class EvenOddController {
	
	@Autowired
	EvenOddService srvs;
	
	@GetMapping(value="/evenodd/{num}",produces=MediaType.TEXT_PLAIN_VALUE)
	public String evenOdd(@PathVariable int num) {
		return srvs.evenOdd(num);
	}
}
