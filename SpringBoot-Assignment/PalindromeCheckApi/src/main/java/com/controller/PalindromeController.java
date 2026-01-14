package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.service.PalindromeService;

@RestController
public class PalindromeController {
	
	@Autowired
	PalindromeService srvs;
	
	@GetMapping(value="palindrome/{word}",produces=MediaType.TEXT_PLAIN_VALUE)
	public String palindrome(@PathVariable String word)
	{
		return srvs.palindrome(word);
	}
}
