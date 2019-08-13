package com.cg.devops.dao;

/**
 * 
 * @author Team1
 * @viewedBy certainSomeone
 * Dao Interface ReportDao
 *
 */
public interface ReportDao {
	/**
	 * Method getBugs of Service
	 * @param language
	 * @return Object Bugs
	 */
	public int getBugs(String language);
	
	/**
	 * Method getVulnerability of Service
	 * @param language
	 * @return Object Vulnerability
	 */
	public int getVulnerability(String language);
	
	/**
	 * Method getCodeSmell of Service
	 * @param language
	 * @return Object CodeSmell
	 */
	public int getCodeSmell(String language);
	
	/**
	 * Method getHotspot of Service
	 * @param language
	 * @return Object Hotspot
	 */
	public int getHotspot(String language);
	
	/**
	 * Method getMinor of Dao
	 * @param language
	 * @return Object Minor
	 */
	public int getMinor(String language);
	
	/**
	 * Method getCritical of Dao
	 * @param language
	 * @return Object Critical
	 */
	public int getCritical(String language);
	
	/**
	 * Method getInfo of Dao
	 * @param language
	 * @return Object Info
	 */
	public int getInfo(String language);
	
	/**
	 * Method getMajor of Dao
	 * @param language
	 * @return Object Major
	 */
	public int getMajor(String language);
	
	/**
	 * Method getBlocker of Dao
	 * @param language
	 * @return Object Blocker
	 */
	public int getBlocker(String language);
	

}
