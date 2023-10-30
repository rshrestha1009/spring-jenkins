package com.restExample.restfulwebservice;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class RestfulWebServiceApplicationTests {

	public static Logger logger = (Logger) LoggerFactory.getLogger(RestfulWebServiceApplication.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing ......");
		assertEquals(true, true);
	}

}
