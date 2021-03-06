package com.cg.devops.dao;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.cg.devops.exception.ErrorMessages;
import com.cg.devops.exception.ProgramException;

/**
 * 
 * @author Team1
 * @viewedBy certainSomeone
 * Dao Impl ReportDaoImpl
 *
 */
@Repository
public class ReportDaoImpl implements ReportDao {

	private String serverUrl = "http://10.236.246.25:9000/";

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private JSONObject jsonObject;

	@Autowired
	private JSONParser parser;

	/**
	 * Method getBugs of DaoImpl
	 * @param takes String language
	 * Returns integer count
	 */
	@Override
	public int getBugs(String language) {
		final String url = serverUrl + "api/issues/search?types=BUG&languages=" + language;
		final int count = makeApiRequest(url);

		return count;
	}

	/**
	 * 
	 * Method getVulnerability of DaoImpl
	 * @param takes String language
	 * Returns integer count
	 */
	@Override
	public int getVulnerability(String language) {
		final String url = serverUrl + "api/issues/search?types=VULNERABILITY&languages=" + language;
		final int count = makeApiRequest(url);

		return count;

	}

	/**
	 * Method getCodeSmell of DaoImpl
	 * @param takes String language
	 * Returns integer count
	 */
	@Override
	public int getCodeSmell(String language) {
		final String url = serverUrl + "api/issues/search?types=CODE_SMELL&languages=" + language;
		final int count = makeApiRequest(url);

		return count;
	}

	/**
	 * Method getHotspot of DaoImpl
	 * @param takes String language
	 * Returns integer count
	 */
	@Override
	public int getHotspot(String language) {
		final String url = serverUrl + "api/issues/search?types=SECURITY_HOTSPOT&languages=" + language;
		final int count = makeApiRequest(url);

		return count;
	}

	/**
	 * Method getMinor of DaoImpl
	 * @param takes String language
	 * Returns integer count
	 */
	@Override
	public int getMinor(String language) {
		final String url = serverUrl + "api/issues/search?severities=MINOR&languages=" + language;
		final int count = makeApiRequest(url);

		return count;
	}

	/**
	 * Method getCritical of DaoImpl
	 * @param takes String language
	 * Returns integer count
	 */
	@Override
	public int getCritical(String language) {
		final String url = serverUrl + "api/issues/search?severities=CRITICAL&languages=" + language;
		final int count = makeApiRequest(url);

		return count;
	}

	/**
	 * Method getInfo of DaoImpl
	 * @param takes String language
	 * Returns integer count
	 */
	@Override
	public int getInfo(String language) {
		final String url = serverUrl + "api/issues/search?severities=INFO&languages=" + language;
		final int count = makeApiRequest(url);

		return count;
	}

	/**
	 * Method getMajor of DaoImpl
	 * @param takes String language
	 * Returns integer count
	 */
	@Override
	public int getMajor(String language) {
		final String url = serverUrl + "api/issues/search?severities=MAJOR&languages=" + language;
		final int count = makeApiRequest(url);

		return count;
	}

	/**
	 * Method getBlocker of DaoImpl
	 * @param takes String language
	 * Returns integer count
	 */
	@Override
	public int getBlocker(String language) {
		final String url = serverUrl + "api/issues/search?severities=BLOCKER&languages=" + language;
		final int count = makeApiRequest(url);

		return count;
	}

	/**
	 * Method makeApiRequest
	 * @param takes String url
	 * Returns integer count
	 */
	private int makeApiRequest(String url) {
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		try {
			jsonObject = (JSONObject) parser.parse(response.getBody());
		} catch (ParseException e) {
			throw new ProgramException(ErrorMessages.MESSAGE2);
		}
		long count = (long) jsonObject.get("total");
		return (int) count;
	}

	

}
