package com.service;

import org.springframework.stereotype.Service;

@Service
public class PalindromeService {
	public String palindrome(String s) {
		String x=s;
		StringBuilder str=new StringBuilder(x);
		if(str.reverse().toString().equals(s))
			return "Palindrome";
		return "Not a palindrome";
	}
}
