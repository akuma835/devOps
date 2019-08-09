package com.example.devops.dao;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.example.devops.exception.ErrorMessages;
import com.example.devops.exception.ProgramException;

@Repository
public class ReportDaoImpl implements ReportDao {

	private String serverUrl = "http://localhost:9000/";

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private JSONObject jsonObject;

	@Autowired
	private JSONParser parser;

	@Override
	public int getBugs(String language) {
		final String url = serverUrl + "api/issues/search?types=BUG&languages=" + language;
		final int count = makeApiRequest(url);

		return count;
	}

	@Override
	public int getVulnerability(String language) {
		final String url = serverUrl + "api/issues/search?types=VULNERABILITY&languages=" + language;
		final int count = makeApiRequest(url);

		return count;

	}

	@Override
	public int getCodeSmell(String language) {
		final String url = serverUrl + "api/issues/search?types=CODE_SMELL&languages=" + language;
		final int count = makeApiRequest(url);

		return count;
	}

	@Override
	public int getHotspot(String language) {
		final String url = serverUrl + "api/issues/search?types=SECURITY_HOTSPOT&languages=" + language;
		final int count = makeApiRequest(url);

		return count;
	}

	@Override
	public int getMinor(String language) {
		final String url = serverUrl + "api/issues/search?severities=MINOR&languages=" + language;
		final int count = makeApiRequest(url);

		return count;
	}

	@Override
	public int getCritical(String language) {
		final String url = serverUrl + "api/issues/search?severities=CRITICAL&languages=" + language;
		final int count = makeApiRequest(url);

		return count;
	}

	@Override
	public int getInfo(String language) {
		final String url = serverUrl + "api/issues/search?severities=INFO&languages=" + language;
		final int count = makeApiRequest(url);

		return count;
	}

	@Override
	public int getMajor(String language) {
		final String url = serverUrl + "api/issues/search?severities=MAJOR&languages=" + language;
		final int count = makeApiRequest(url);

		return count;
	}

	@Override
	public int getBlocker(String language) {
		final String url = serverUrl + "api/issues/search?severities=BLOCKER&languages=" + language;
		final int count = makeApiRequest(url);

		return count;
	}
	
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
