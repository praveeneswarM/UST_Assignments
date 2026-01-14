package com.service;

import org.springframework.stereotype.Service;

@Service
public class EvenOddService {
	public String evenOdd(int n) {
		return n%2==0?"Even":"Odd";
	}
}
