package com.cg.devops;

import org.json.simple.parser.JSONParser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author Team1
 * @viewedBy certainSomeone
 * Bean Class AppConfig
 *
 */
@Configuration
public class AppConfig {

	/**
	 * Method getRestTemplate
	 * @return Object RestTemplate
	 */
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

//	@Bean
//	public HttpHeaders getHttpHeaders() {
//		return new HttpHeaders();
//	}

	
	/**
	 * Method getJsonParser
	 * @return Parsed JSON 
	 */
	@Bean
	public JSONParser getJsonParser() {
		return new JSONParser();
	}
}
