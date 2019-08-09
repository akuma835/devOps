package com.example.devops.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.devops.beans.Report;
import com.example.devops.beans.SeverityCount;
import com.example.devops.beans.TypeCount;
import com.example.devops.dao.ReportDao;

@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	private ReportDao reportdao;

	@Override
	public Report getReport(String language) {
		
		Report report = new Report();
		report.setDate(LocalDate.now());
		TypeCount typeCount = getTypeCounts(language);
		report.setTypeCount(typeCount);
		SeverityCount severityCount = getSeverityCount(language);
		report.setSeverityCount(severityCount);
	
		System.out.println(typeCount.getBugsCount());
		return report;
	}

	private SeverityCount getSeverityCount(String language) {
		// TODO Auto-generated method stub
		return null;
	}

	private TypeCount getTypeCounts(String language) {
		TypeCount typeCount= new TypeCount();
		int bugs = reportdao.getBugs(language);
		int vulnerabilityCount= reportdao.getVulnerability(language);
		//other property 
		typeCount.setBugsCount(bugs);
		typeCount.setVulnerabilityCount(vulnerabilityCount);
		//assign other counts
		return typeCount;
	}

}
