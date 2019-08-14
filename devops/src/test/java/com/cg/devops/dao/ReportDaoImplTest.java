package com.cg.devops.dao;

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

import com.cg.devops.exception.ProgramException;

@Configuration
@ComponentScan(basePackages = { "com.cg.devops.dao" })
class SpringTestContext {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	public JSONParser getJsonParser() {
		return new JSONParser();
	}
	
}

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringTestContext.class)
public class ReportDaoImplTest {

	@Autowired
	private ReportDao reportDao;

	
	@Test(expected = ProgramException.class)
	public void testGetBugs() {
		reportDao.getBugs("java");
	}
	
	@Test(expected = ProgramException.class)
	public void testGetVulnerability() {
		reportDao.getVulnerability("java");
	}
	
		
	@Test(expected = ProgramException.class)
	public void testGetCodeSmell() {
		reportDao.getCodeSmell("java");
	}
	
	@Test(expected = ProgramException.class)
	public void testGetHotspot() {
		reportDao.getHotspot("java");
	}
	
	@Test(expected = ProgramException.class)
	public void testGetMinor() {
		reportDao.getMinor("java");
	}
	@Test(expected = ProgramException.class)
	public void testGetCritical() {
		reportDao.getCritical("java");
	}
	
	@Test(expected = ProgramException.class)
	public void testGetInfo() {
		reportDao.getInfo("java");
	}
	
	@Test(expected = ProgramException.class)
	public void testGetMajor() {
		reportDao.getMajor("java");
	}
	
	@Test(expected = ProgramException.class)
	public void testGetBlocker() {
		reportDao.getBlocker("java");
	}
	
	
	
	

}
