package com.service;

import org.springframework.stereotype.Service;

@Service
public class CatagoryService {
	public String Catagory(int age) {
		if(age<18)
			return "Child";
		else if(age>=18 && age<=59)
			return "Adult";
		else if(age>=60)
			return "Senior";
		return "Age invalid";
	}
}
