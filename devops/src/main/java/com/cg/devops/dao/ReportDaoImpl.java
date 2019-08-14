package com.cg.devops.dao;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.cg.devops.exception.ErrorMessagesUtils;
import com.cg.devops.exception.ProgramException;

/**
 * 
 * @author Team1
 * @viewedBy certainSomeone Dao Impl ReportDaoImpl
 *
 */
@Repository
public class ReportDaoImpl implements ReportDao {

	/**
	 * sonar Api server configuration
	 */
	private final String serverUrl = "http://localhost:9000/";

	/**
	 * For making http request to the sonar api
	 */
	@Autowired
	private RestTemplate restTemplate;

	/**
	 * for parsing the json received by sonar api
	 */
	@Autowired
	private JSONParser parser;

	/**
	 * @param takes String language 
	 * Returns integer count
	 */
	@Override
	public int getBugs(final String language) {
		final String url = serverUrl + "api/issues/search?types=BUG&languages=" + language;
		return makeApiRequest(url);
	}

	/**
	 * 
	 * @param takes String language Returns integer count
	 */
	@Override
	public int getVulnerability(final String language) {
		final String url = serverUrl + "api/issues/search?types=VULNERABILITY&languages=" + language;
		return makeApiRequest(url);

	}

	/**
	 * @param takes String language Returns integer count
	 */
	@Override
	public int getCodeSmell(final String language) {
		final String url = serverUrl + "api/issues/search?types=CODE_SMELL&languages=" + language;
		return makeApiRequest(url);
	}

	/**
	 * @param takes String language Returns integer count
	 */
	@Override
	public int getHotspot(final String language) {
		final String url = serverUrl + "api/issues/search?types=SECURITY_HOTSPOT&languages=" + language;
		return makeApiRequest(url);
	}

	/**
	 * @param takes String language Returns integer count
	 */
	@Override
	public int getMinor(final String language) {
		final String url = serverUrl + "api/issues/search?severities=MINOR&languages=" + language;
		return makeApiRequest(url);
	}

	/**
	 * @param takes String language Returns integer count
	 */
	@Override
	public int getCritical(final String language) {
		final String url = serverUrl + "api/issues/search?severities=CRITICAL&languages=" + language;
		return makeApiRequest(url);
	}

	/**
	 * @param takes String language Returns integer count
	 */
	@Override
	public int getInfo(final String language) {
		final String url = serverUrl + "api/issues/search?severities=INFO&languages=" + language;
		return makeApiRequest(url);
	}

	/**
	 * @param takes String language Returns integer count
	 */
	@Override
	public int getMajor(final String language) {
		final String url = serverUrl + "api/issues/search?severities=MAJOR&languages=" + language;
		return makeApiRequest(url);
	}

	/**
	 * @param takes String language Returns integer count
	 */
	@Override
	public int getBlocker(final String language) {
		final String url = serverUrl + "api/issues/search?severities=BLOCKER&languages=" + language;
		return makeApiRequest(url);
	}

	/**
	 * Method makeApiRequest
	 * 
	 * @param takes String url Returns integer count after parsing from json object
	 */
	private int makeApiRequest(final String url) {
		ResponseEntity<String> response = null;
		JSONObject jsonObject = null;
		try {
			response = restTemplate.getForEntity(url, String.class);
			jsonObject = (JSONObject) parser.parse(response.getBody());
		} catch (RestClientException e) {
			throw new ProgramException(ErrorMessagesUtils.MESSAGE2);
		} catch (ParseException e) {
			throw new ProgramException(ErrorMessagesUtils.MESSAGE4);
		}
		
		return (int) jsonObject.get("total");
	}

}
