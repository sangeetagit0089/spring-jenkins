package com.example.spring.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class SpringJenkinsApplicationTests {
	
	public static Logger logger=LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);

	@Test
	public void contextLoads() {
		logger.info("test case executed.......");
		assertEquals(true, true);
	}

}
