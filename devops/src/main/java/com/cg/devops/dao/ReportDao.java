package com.cg.devops.dao;

/**
 * 
 * @author Team1
 * @viewedBy Amit Kumar Dao Interface ReportDao
 *
 */
public interface ReportDao {
	/**
	 * Method getBugs 
	 * 
	 * @param language
	 * @return Object Bugs
	 */
	public int getBugs(String language);

	/**
	 * Method getVulnerability 
	 * 
	 * @param language
	 * @return Object Vulnerability
	 */
	public int getVulnerability(String language);

	/**
	 * Method getCodeSmell 
	 * 
	 * @param language
	 * @return Object CodeSmell
	 */
	public int getCodeSmell(String language);

	/**
	 * Method getHotspot 
	 * 
	 * @param language
	 * @return Object Hotspot
	 */
	public int getHotspot(String language);

	/**
	 * Method getMinor of Dao
	 * 
	 * @param language
	 * @return Object Minor
	 */
	public int getMinor(String language);

	/**
	 * Method getCritical of Dao
	 * 
	 * @param language
	 * @return Object Critical count
	 */
	public int getCritical(String language);

	/**
	 * Method getInfo of Dao
	 * 
	 * @param language
	 * @return Object Info count
	 */
	public int getInfo(String language);

	/**
	 * Method getMajor of Dao
	 * 
	 * @param language
	 * @return Object Major count
	 */
	public int getMajor(String language);

	/**
	 * Method getBlocker of Dao
	 * 
	 * @param language
	 * @return Object Blocker count
	 */
	public int getBlocker(String language);

}
