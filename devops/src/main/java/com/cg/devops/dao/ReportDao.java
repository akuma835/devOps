package com.cg.devops.dao;

public interface ReportDao {
	public int getBugs(String language);
	public int getVulnerability(String language);
	public int getCodeSmell(String language);
	public int getHotspot(String language);
	public int getMinor(String language);
	public int getCritical(String language);
	public int getInfo(String language);
	public int getMajor(String language);
	public int getBlocker(String language);
	

}
