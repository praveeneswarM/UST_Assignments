package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.service.ConversionService;

@RestController	
public class ConversionController {
	
	@Autowired
	ConversionService srvs;
	
	@GetMapping("celsius-to-fahrenheit/{celsius}")
	public float convertCelsiustoFahrenheit(@PathVariable float celsius) {
		return srvs.convertCelsiusToFahrenheit(celsius);
	}
}
