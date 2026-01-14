package com.service;

import org.springframework.stereotype.Service;

@Service
public class DiscountService {
	public int discount(int p,int d) {
		return p-((p*d)/100);
	}
}
