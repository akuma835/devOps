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

import com.cg.devops.exception.ErrorMessages;
import com.cg.devops.exception.ProgramException;

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
	public int getBugs(final String language) {
		final String url = serverUrl + "api/issues/search?types=BUG&languages=" + language;
		final int count = makeApiRequest(url);

		return count;
	}

	@Override
	public int getVulnerability(final String language) {
		final String url = serverUrl + "api/issues/search?types=VULNERABILITY&languages=" + language;
		final int count = makeApiRequest(url);

		return count;

	}

	@Override
	public int getCodeSmell(final String language) {
		final String url = serverUrl + "api/issues/search?types=CODE_SMELL&languages=" + language;
		final int count = makeApiRequest(url);

		return count;
	}

	@Override
	public int getHotspot(final String language) {
		final String url = serverUrl + "api/issues/search?types=SECURITY_HOTSPOT&languages=" + language;
		final int count = makeApiRequest(url);

		return count;
	}

	@Override
	public int getMinor(final String language) {
		final String url = serverUrl + "api/issues/search?severities=MINOR&languages=" + language;
		final int count = makeApiRequest(url);

		return count;
	}

	@Override
	public int getCritical(final String language) {
		final String url = serverUrl + "api/issues/search?severities=CRITICAL&languages=" + language;
		final int count = makeApiRequest(url);

		return count;
	}

	@Override
	public int getInfo(final String language) {
		final String url = serverUrl + "api/issues/search?severities=INFO&languages=" + language;
		final int count = makeApiRequest(url);

		return count;
	}

	@Override
	public int getMajor(final String language) {
		final String url = serverUrl + "api/issues/search?severities=MAJOR&languages=" + language;
		final int count = makeApiRequest(url);

		return count;
	}

	@Override
	public int getBlocker(final String language) {
		final String url = serverUrl + "api/issues/search?severities=BLOCKER&languages=" + language;
		final int count = makeApiRequest(url);

		return count;
	}

	private int makeApiRequest(final String url) {
		ResponseEntity<String> response = null;
		try {
			response = restTemplate.getForEntity(url, String.class);
			jsonObject = (JSONObject) parser.parse(response.getBody());
		} catch (RestClientException e) {
			throw new ProgramException(ErrorMessages.MESSAGE2);
		}
		catch (ParseException e) {
			throw new ProgramException(ErrorMessages.MESSAGE4);
		}
		long count = (long) jsonObject.get("total");
		return (int) count;
	}

}
