package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.DiscountService;

@RestController
public class DiscountController {
	
	@Autowired
	DiscountService srvs;
	
	@GetMapping("/discount")
	public int discount(@RequestParam int price,@RequestParam int discount) {
		return srvs.discount(price, discount);
	}	
}
