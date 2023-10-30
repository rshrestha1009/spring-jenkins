package com.restExample.restfulwebservice;

import jakarta.annotation.PostConstruct;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class RestfulWebServiceApplication {
	public static Logger logger = (Logger) LoggerFactory.getLogger(RestfulWebServiceApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application Started.....");
	}


	public static void main(String[] args) {
		logger.info("Application executed.....");
		SpringApplication.run(RestfulWebServiceApplication.class, args);
	}

}
