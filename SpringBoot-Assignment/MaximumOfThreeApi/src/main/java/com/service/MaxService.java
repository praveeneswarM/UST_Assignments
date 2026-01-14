package com.service;

import org.springframework.stereotype.Service;

@Service
public class MaxService {
	public int max(int a,int b,int c) {
		if(a>b && a>c)
			return a;
		else if(b>c)
			return b;
		return c;
	}
}
