package com.cg.devops.beans;

import java.io.Serializable;

public class TypeCount implements Serializable {

	private static final long serialVersionUID = 1L;
	private int bugsCount;
	private int vulnerabilityCount;
	private int codeSmell;
	private int securityHotspot;

	public TypeCount() {

	}

	public int getBugsCount() {
		return bugsCount;
	}

	public void setBugsCount(int bugsCount) {
		this.bugsCount = bugsCount;
	}

	public int getVulnerabilityCount() {
		return vulnerabilityCount;
	}

	public void setVulnerabilityCount(int vulnerabilityCount) {
		this.vulnerabilityCount = vulnerabilityCount;
	}

	public int getCodeSmell() {
		return codeSmell;
	}

	public void setCodeSmell(int codeSmell) {
		this.codeSmell = codeSmell;
	}

	public int getSecurityHotspot() {
		return securityHotspot;
	}

	public void setSecurityHotspot(int securityHotspot) {
		this.securityHotspot = securityHotspot;
	}

}
