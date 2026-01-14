package com.service;

import org.springframework.stereotype.Service;

@Service
public class GradeService {
	public String grade(int mark) {
		if(mark>=90)
			return "A";
		else if(mark>=75)
			return "B";
		else if(mark>=60)
			return "C";
		else
			return "Fail";
	}
}
