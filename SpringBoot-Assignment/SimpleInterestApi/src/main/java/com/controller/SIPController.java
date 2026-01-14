package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.SIPService;

@RestController
public class SIPController {
	
	@Autowired
	SIPService srvs;
	
	
	@GetMapping("/interest")
	public float SIP(@RequestParam float p,@RequestParam float r,@RequestParam float t) {
		return srvs.SIP(p, r, t);
	}
}
