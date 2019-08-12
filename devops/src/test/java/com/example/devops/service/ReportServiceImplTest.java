package com.example.devops.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.devops.beans.Report;

@Configuration
@ComponentScan(basePackages = { "com.example.devops.service", 
		"com.example.devops.stub"})
class SpringTestContext {
	
}

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringTestContext.class)
public class ReportServiceImplTest {

	@Autowired
	private ReportService reportService;

	@Test
	public void testGetReport() {
		
		assertTrue(reportService.getReport("java") instanceof Report);
		
	}

	@Test
	public void testGetSeverityCount() {
		
		Report report = reportService.getReport("java");
		assertEquals(report.getSeverityCount().getMajorCount(),0);
		
		
	}
	
	@Test
	public void testGetTypeCount() {
		
		Report report = reportService.getReport("java");
		assertEquals(report.getTypeCount().getCodeSmell(),0);
		
		
	}
	
	
}


