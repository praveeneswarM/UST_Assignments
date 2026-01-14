package com.service;

import org.springframework.stereotype.Service;

@Service
public class SIPService {
	public float SIP(float p,float r,float t) {
		return (p*r*t)/100;
	}
}
