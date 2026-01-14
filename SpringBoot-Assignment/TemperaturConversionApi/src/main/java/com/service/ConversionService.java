package com.service;

import org.springframework.stereotype.Service;

@Service
public class ConversionService {
	public float convertCelsiusToFahrenheit(float celsius) {
		return ((celsius*(9/5))+32);
	}
}
