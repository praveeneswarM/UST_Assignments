package com.service;

import org.springframework.stereotype.Service;

@Service
public class FactorialService {
	public int fact(int n) {
		int f=1;
		for(int i=2;i<=n;i++)
			f*=i;
		return f;
	}
}
