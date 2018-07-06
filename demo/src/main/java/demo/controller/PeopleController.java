package demo.controller;

import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.domain.People;
import demo.redis.RedisKeyPrefix;
import demo.service.PeopleService;

@RestController
public class PeopleController {

	private static final Logger log = LoggerFactory.getLogger(PeopleController.class);
	
	@Resource
	RedisTemplate<String, Object> redisTemplate;
	
	@Autowired
	private PeopleService peopleService;
	
	@RequestMapping("/people")
	public People peopleShow(Integer id){
		String key = RedisKeyPrefix.DEMOPREFIX + id;
        // 缓存存在
        boolean hasKey = redisTemplate.hasKey(key);
        if (hasKey) { // 从缓存中取
        	People people = (People)redisTemplate.opsForValue().get(key);
            log.info("peopleShow 从缓存中获取了用户！");
            return people;
        }
        log.info("peopleShow 从数据库取，并存回缓存！");
        // 从数据库取，并存回缓存
        People people = new People();
        people.setUserName("tony");
        people.setSex("male");
        people.setHobby("basketball");
        // 放入缓存，并设置缓存时间
        redisTemplate.opsForValue().set(key, people, 600, TimeUnit.SECONDS);
        return people;
	}
	
	@RequestMapping("/peopleAnotation")
	public People peopleShowAnotation(String id){
		log.info("peopleShowAnotation coming into！id = " + id);
        return peopleService.show(id);
	}
	
	@RequestMapping("/peopleshow1")
	public People peopleShow1(String id){
		log.info("peopleShow1 coming into！id = " + id);
        return peopleService.show1(id);
	}
	
}
