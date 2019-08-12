package com.example.devops.beans;

/**
 * 
 * @author Team1
 * @viewedBy certainSomeone
 * Bean Class TypeCount
 *
 */
public class TypeCount {

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
