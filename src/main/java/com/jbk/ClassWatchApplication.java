package com.jbk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClassWatchApplication {

	static Logger logger = LoggerFactory.getLogger(ClassWatchApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ClassWatchApplication.class, args);
		logger.info("App Started");
		System.out.println("Application Started Successfully");
	}

}
