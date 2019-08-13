package com.cg.devops.beans;

import java.io.Serializable;
import java.time.LocalDate;

public class Report implements Serializable {

	private static final long serialVersionUID = 1L;
	private SeverityCount severityCount;
	private TypeCount typeCount;
	private LocalDate date;

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
