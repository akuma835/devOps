package com.example.devops.dao;

import com.example.devops.beans.Issue;

public interface ReportDao {
	public Issue getReport(String language);
	public int getBugs(String language);
	public int getVulnerability(String language);
	public int getCodeSmell(String language);
	public int getHotspot(String language);
	public int getMinor(String language);
	public int getCritical(String language);
	public int getInfo(String language);
	public int getMajor(String language);
	

}
