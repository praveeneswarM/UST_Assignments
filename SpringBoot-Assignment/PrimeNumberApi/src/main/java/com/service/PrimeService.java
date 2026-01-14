package com.service;

import org.springframework.stereotype.Service;

@Service
public class PrimeService {
	public String prime(int n) {
		int f=0;
		if(n==1)
			return "Not Prime";
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
				f++;
		}
		if(f==1)
			return "Prime";
		return "Not Prime";
	}
}
