/**
 * 
 */
package com.cg.devops.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

import com.cg.devops.beans.SeverityCount;
import com.cg.devops.beans.TypeCount;

import mockit.Mock;
import mockit.MockUp;
import mockit.integration.junit4.JMockit;

/**
 * @author Sarika Yadav
 *Service method tests
 */

@Configuration
@ComponentScan(basePackages = { "com.cg.devops.service" })
class SpringTestContext {
	
	@Bean
	public ReportService getReportService() {
		return new ReportServiceImpl();
	}
}

@RunWith(JMockit.class)
@ContextConfiguration(classes = SpringTestContext.class)
public class ReportServiceImplTest {

//	@Injectable
//	private ReportService reportService;
//
//	@Tested
//	private ReportServiceImpl reportServiceImpl;

	@Test
	public void testGetReport() {

		new MockUp<ReportServiceImpl>() {
			@Mock
			private SeverityCount getSeverityCount(final String language) {
				SeverityCount severityCount = new SeverityCount();
				return severityCount;
			}

			@Mock
			private TypeCount getTypeCount(final String language) {
				TypeCount typeCount = new TypeCount();
				typeCount.setBugsCount(2);
				return typeCount;

			}

		};
		ReportService reportService = new ReportServiceImpl();
		Assert.assertTrue(reportService.getReport("java").getTypeCount() instanceof TypeCount);
		Assert.assertTrue(reportService.getReport("web").getSeverityCount() instanceof SeverityCount);
		Assert.assertEquals(reportService.getReport("lang").getTypeCount().getBugsCount(), 2);
	}

}
