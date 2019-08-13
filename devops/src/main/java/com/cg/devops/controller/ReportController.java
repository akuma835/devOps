package com.cg.devops.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.devops.beans.Report;
import com.cg.devops.exception.ErrorMessagesUtils;
import com.cg.devops.exception.ProgramException;
import com.cg.devops.service.ReportService;

@CrossOrigin("*")
@RestController
public class ReportController {

	@Autowired
	private ReportService reportService;

	@GetMapping(value = "/report/{language}", produces = "application/json")
	public Report getReport(@PathVariable("language")final  String language) {
		if (!language.matches("[a-zA-Z]{1,}")) {
			throw new ProgramException(ErrorMessagesUtils.MESSAGE3);
		}
		final Report report =reportService.getReport(language);
		return report;
	}

}
