package com.cg.devops.beans;

public class SeverityCount {
	private int blockerCount;
	private int minorCount;
	private int majorCount;
	private int criticalCount;
	private int infoCount;
	
	
	
	public SeverityCount() {
	}
	public int getBlockerCount() {
		return blockerCount;
	}
	public void setBlockerCount(int blockerCount) {
		this.blockerCount = blockerCount;
	}
	public int getMinorCount() {
		return minorCount;
	}
	public void setMinorCount(int minorCount) {
		this.minorCount = minorCount;
	}
	public int getMajorCount() {
		return majorCount;
	}
	public void setMajorCount(int majorCount) {
		this.majorCount = majorCount;
	}
	public int getCriticalCount() {
		return criticalCount;
	}
	public void setCriticalCount(int criticalCount) {
		this.criticalCount = criticalCount;
	}
	public int getInfoCount() {
		return infoCount;
	}
	public void setInfoCount(int infoCount) {
		this.infoCount = infoCount;
	}
	
	
	
}