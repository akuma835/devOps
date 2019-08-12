package com.example.devops;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

//	@Bean
//	public HttpHeaders getHttpHeaders() {
//		return new HttpHeaders();
//	}

	
	@Bean
	public JSONObject getJsonObject() {
		return  new JSONObject(); 
	}
	@Bean
	public JSONParser getJsonParser() {
		return new JSONParser();
	}
}
