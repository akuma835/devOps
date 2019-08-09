package com.example.devops.dao;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.example.devops.beans.Issue;

@Repository
public class ReportDaoImpl implements ReportDao {

	private String serverUrl="http://localhost:9000/";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private JSONObject jsonObject;
	
	@Autowired
	private JSONParser parser;

	@Override
	public Issue getReport(String language) {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public int getBugs(String language) {
		final String url = serverUrl+"api/issues/search?languages=java&types=BUG";
		ResponseEntity<String> response
		  = restTemplate.getForEntity(url, String.class);
		try {
			jsonObject = (JSONObject) parser.parse(response.getBody());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(response.getBody());
		long count = (long) jsonObject.get("total");
		
		return (int)count;
	}

	@Override
	public int getVulnerability(String language) {
		final String url = "http://localhost:9000/api/issues/search?languages=java&types=Vulnerability";
		ResponseEntity<String> response
		  = restTemplate.getForEntity(url, String.class);
		try {
			jsonObject = (JSONObject) parser.parse(response.getBody());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(response.getBody());
		long count = (long) jsonObject.get("total");
		
		return (int)count;
		
	}

	@Override
	public int getCodeSmell(String language) {
		final String url = "http://localhost:9000/api/issues/search?languages=java&types=CodeSmell";
		ResponseEntity<String> response
		  = restTemplate.getForEntity(url, String.class);
		try {
			jsonObject = (JSONObject) parser.parse(response.getBody());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(response.getBody());
		long count = (long) jsonObject.get("total");
		
		return (int)count;
	}

	@Override
	public int getHotspot(String language) {
		final String url = "http://localhost:9000/api/issues/search?languages=java&types=Hotspot";
		ResponseEntity<String> response
		  = restTemplate.getForEntity(url, String.class);
		try {
			jsonObject = (JSONObject) parser.parse(response.getBody());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(response.getBody());
		long count = (long) jsonObject.get("total");
		
		return (int)count;
	}

	@Override
	public int getMinor(String language) {
		final String url = "http://localhost:9000/api/issues/search?languages=java&severities=Minor";
		ResponseEntity<String> response
		  = restTemplate.getForEntity(url, String.class);
		try {
			jsonObject = (JSONObject) parser.parse(response.getBody());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(response.getBody());
		long count = (long) jsonObject.get("total");
		
		return (int)count;
	}

	@Override
	public int getCritical(String language) {
		final String url = "http://localhost:9000/api/issues/search?languages=java&severities=Critical";
		ResponseEntity<String> response
		  = restTemplate.getForEntity(url, String.class);
		try {
			jsonObject = (JSONObject) parser.parse(response.getBody());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(response.getBody());
		long count = (long) jsonObject.get("total");
		
		return (int)count;
	}

	@Override
	public int getInfo(String language) {
		final String url = "http://localhost:9000/api/issues/search?languages=java&severities=Info";
		ResponseEntity<String> response
		  = restTemplate.getForEntity(url, String.class);
		try {
			jsonObject = (JSONObject) parser.parse(response.getBody());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(response.getBody());
		long count = (long) jsonObject.get("total");
		
		return (int)count;
	}

	@Override
	public int getMajor(String language) {
		final String url = "http://localhost:9000/api/issues/search?languages=java&severities=Major";
		ResponseEntity<String> response
		  = restTemplate.getForEntity(url, String.class);
		try {
			jsonObject = (JSONObject) parser.parse(response.getBody());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(response.getBody());
		long count = (long) jsonObject.get("total");
		
		return (int)count;
	}

	
}
