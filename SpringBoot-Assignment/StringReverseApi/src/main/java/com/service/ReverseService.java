package com.service;

import org.springframework.stereotype.Service;

@Service
public class ReverseService {
	public String reverseString(String s) {
		StringBuilder str=new StringBuilder(s);
		return str.reverse().toString();
	}
}
