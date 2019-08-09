package com.example.devops.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.devops.beans.Report;
import com.example.devops.exception.ErrorMessages;
import com.example.devops.exception.ProgramException;
import com.example.devops.service.ReportService;

@CrossOrigin("*")
@RestController
public class ReportController {

	@Autowired
	private ReportService reportService;

	@GetMapping(value = "/report/{language}", produces = "application/json")
	public Report removeStudent(@PathVariable("language") String language) {
		if (null==language) {
			throw new ProgramException(ErrorMessages.MESSAGE3);
		}
		Report report =reportService.getReport(language);
		return report;
	}

}
