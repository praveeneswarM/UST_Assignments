package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.service.GradeService;

@RestController
public class GradeController {

	@Autowired
	GradeService srvs;
	
	@GetMapping(value="grade/{marks}",produces=MediaType.TEXT_PLAIN_VALUE)
	public String grade(@PathVariable int marks) {
		return srvs.grade(marks);
	}
}
