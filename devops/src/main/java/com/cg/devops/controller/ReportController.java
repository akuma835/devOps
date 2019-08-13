package com.cg.devops.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.devops.beans.Report;
import com.cg.devops.exception.ErrorMessages;
import com.cg.devops.exception.ProgramException;
import com.cg.devops.service.ReportService;

/**
 * 
 * @author Team1
 * @viewedBy certainSomeone
 * Controller ReportController
 *
 */
@CrossOrigin("*")
@RestController
public class ReportController {

	@Autowired
	private ReportService reportService;

	/**
	 * Method getReport
	 * @param String language 
	 * @return report
	 */
	@GetMapping(value = "/report/{language}", produces = "application/json")
	public Report getReport(@PathVariable("language") String language) {
		if (null==language) {
			throw new ProgramException(ErrorMessages.MESSAGE3);
		}
		Report report =reportService.getReport(language);
		return report;
	}

}
