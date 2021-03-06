package com.cg.devops.beans;

import java.time.LocalDate;

/**
 * 
 * @author Team1
 * @viewedBy certainSomeone
 * Bean Class Report
 *
 */
public class Report {
	private SeverityCount severityCount;
	private TypeCount typeCount;
	private LocalDate date;

	/**
	 * Default Constructor Report
	 */
	public Report() {
	}

	public SeverityCount getSeverityCount() {
		return severityCount;
	}

	public void setSeverityCount(SeverityCount severityCount) {
		this.severityCount = severityCount;
	}

	public TypeCount getTypeCount() {
		return typeCount;
	}

	public void setTypeCount(TypeCount typeCount) {
		this.typeCount = typeCount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
