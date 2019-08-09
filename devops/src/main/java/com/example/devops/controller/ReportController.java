package com.example.devops.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.devops.service.ReportService;

@CrossOrigin("*")
@RestController
public class ReportController {
	
	@Autowired
	private ReportService reportService;
	
	@GetMapping(value = "/report", produces = "application/json")
	public boolean removeStudent(){

		reportService.getReport("java");
		return true;
	}

}
