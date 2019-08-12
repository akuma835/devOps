package com.example.devops.service;

import com.example.devops.beans.Report;

/**
 * 
 * @author Team1
 * @viewedBy certainSomeone
 * Service Interface ReportService
 *
 */
public interface ReportService {
	/**
	 * 
	 * @param language
	 * @return Report object
	 */
	public Report getReport(String language);

}
