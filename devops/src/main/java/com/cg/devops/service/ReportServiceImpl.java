package com.cg.devops.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.devops.beans.Report;
import com.cg.devops.beans.SeverityCount;
import com.cg.devops.beans.TypeCount;
import com.cg.devops.dao.ReportDao;

/**
 * 
 * @author Team1
 * @viewedBy certainSomeone
 * Service Implementation ReportServiceImpl
 */
@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	private ReportDao reportdao;

	/**
	 * Method getReport of ServiceImpl
	 * @param takes String language
	 * Returns Object report 
	 */
	@Override
	public Report getReport(String language) {
		
		Report report = new Report();
		report.setDate(LocalDate.now());
		
		TypeCount typeCount = getTypeCount(language);
		report.setTypeCount(typeCount);
		
		SeverityCount severityCount = getSeverityCount(language);
		report.setSeverityCount(severityCount);

		return report;
	}

	/**
	 * Method getSeverityCount of ServiceImpl
	 * @param takes String language
	 * Returns Object severityCount
	 */
	private SeverityCount getSeverityCount(String language) {
		SeverityCount severityCount = new SeverityCount();
		
		int minorCount = reportdao.getMinor(language);
		int criticalCount = reportdao.getCritical(language);
		int infoCount = reportdao.getInfo(language);
		int majorCount = reportdao.getMajor(language);
		int blockerCount= reportdao.getBlocker(language);
		
		severityCount.setMinorCount(minorCount);
		severityCount.setCriticalCount(criticalCount);
		severityCount.setInfoCount(infoCount);
		severityCount.setMajorCount(majorCount);
		severityCount.setBlockerCount(blockerCount);
		
		return severityCount;
	}

	/**
	 * Method getTypeCount of ServiceImpl
	 * @param takes String language
	 * Returns Object typeCount
	 */
	private TypeCount getTypeCount(String language) {
		TypeCount typeCount= new TypeCount();
		
		int bugs = reportdao.getBugs(language);
		int vulnerabilityCount= reportdao.getVulnerability(language);
		int codeSmell = reportdao.getCodeSmell(language);
		int securityHotspot = reportdao.getHotspot(language);
		
 
		typeCount.setBugsCount(bugs);
		typeCount.setVulnerabilityCount(vulnerabilityCount);
		typeCount.setCodeSmell(codeSmell);
		typeCount.setSecurityHotspot(securityHotspot);
		
		
		return typeCount;
	}

}
