package demo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import demo.service.DubboDemoService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringApplicationTest {

	private static final Logger log = LoggerFactory.getLogger(SpringApplicationTest.class);
	
	@Autowired
	DubboDemoService dubboDemoService;
	
	
	@Test
	public void testDubbo(){
		log.info("coming into.....");
		dubboDemoService.example();
	}
}
