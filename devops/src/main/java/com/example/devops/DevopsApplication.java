package com.example.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author Team1
 * @viewedBy certainSomeone
 * SpringBootApplication DevopsApplication
 *
 */
@SpringBootApplication
public class DevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsApplication.class, args);
		System.out.println("Startup Success");
	}

}
