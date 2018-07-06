package demo.test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import demo.dao.RedisDao;
import demo.domain.People;
import demo.redis.RedisKeyPrefix;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringApplicationTest {

	private static final Logger log = LoggerFactory.getLogger(SpringApplicationTest.class);
	
	@Autowired
	RedisDao redisDao;
	
	@Autowired
	RedisTemplate<String, Object> redisTemplate;
	
	@Test
	public void testRedis(){
		redisDao.set("hello", "world");
		log.info(redisDao.get("hello"));
	}
	
	@Test
	public People findOne(Integer id) {
        String key = RedisKeyPrefix.DEMOPREFIX + id;
        // 缓存存在
        boolean hasKey = redisTemplate.hasKey(key);
        if (hasKey) { // 从缓存中取
        	People people = (People)redisTemplate.opsForValue().get(key);
            log.info("从缓存中获取了用户！");
            return people;
        }
        // 从数据库取，并存回缓存
        People people = new People();
        people.setUserName("tony");
        people.setSex("male");
        people.setHobby("basketball");
        // 放入缓存，并设置缓存时间
        redisTemplate.opsForValue().set(key, people, 600, TimeUnit.SECONDS);
        return people;
    }
	
}
