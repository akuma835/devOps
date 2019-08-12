package com.example.devops.dao;

/**
 * 
 * @author Team1
 * @viewedBy certainSomeone
 * Dao Interface ReportDao
 *
 */
public interface ReportDao {
	/**
	 * 
	 * @param language
	 * @return
	 */
	public int getBugs(String language);
	/**
	 * 
	 * @param language
	 * @return
	 */
	public int getVulnerability(String language);
	
	public int getCodeSmell(String language);
	public int getHotspot(String language);
	public int getMinor(String language);
	public int getCritical(String language);
	public int getInfo(String language);
	public int getMajor(String language);
	public int getBlocker(String language);
	

}
