package demo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import demo.dao.RedisDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisApplicationTest {

	private static final Logger log = LoggerFactory.getLogger(RedisApplicationTest.class);
	
	@Autowired
	RedisDao redisDao;
	
	@Test
	public void testRedis(){
		redisDao.set("hello", "world");
		log.info("key : " + redisDao.get("hello"));
	}
}
