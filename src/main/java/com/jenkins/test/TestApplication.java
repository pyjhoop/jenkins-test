package com.jenkins.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class TestApplication {

	public static final String APPLICATION_LOCATIONS = "spring.config.location="
			+ "classpath:application.yml,"
			+ "classpath:real-application.yml";

	public static void main(String[] args) {
		new SpringApplicationBuilder(TestApplication.class)
				.properties(APPLICATION_LOCATIONS)
				.run(args);
	}
}
