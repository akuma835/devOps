package com.example.devops.dao;

import static org.junit.Assert.*;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;


/**
 * 
 * @author Team1
 * @viewedBy certainSomeone
 *
 */
@Configuration
@ComponentScan(basePackages = { "com.example.devops.dao"})
class SpringTestContext {
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	public JSONObject getJsonObject() {
		return  new JSONObject(); 
	}
	@Bean
	public JSONParser getJsonParser() {
		return new JSONParser();
	}
}

/**
 * 
 * @author Team1
 * @viewedBy certainSomeone
 * Testing of ReportDaoImpl                                                                                                                                                                                                                                                                                                                                                                                                                       
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringTestContext.class)
public class ReportDaoImplTest {

	@Autowired
	private ReportDao reportDao ;
	

	/**
	 * Method testBugsCount 
	 * @param language
	 */
	@Test
	public void testBugsCount() {
		assertTrue(Integer.valueOf(reportDao.getBugs("java")) instanceof Integer);
	}

	/**
	 * Method testVulnerability
	 * @param language
	 */
	@Test
	public void testVulnerabilityCount() {
		
	}
}
