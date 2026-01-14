package com.service;

import org.springframework.stereotype.Service;

@Service
public class CountService {
	public int count(String s) {
		String str[]=s.split(" ");
		return str.length;
	}
}
