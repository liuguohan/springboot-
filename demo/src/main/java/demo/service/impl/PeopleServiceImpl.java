package demo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import demo.domain.People;
import demo.redis.ExpireTime;
import demo.redis.RedisKeyPrefix;
import demo.service.PeopleService;

@Service("peopleService")
public class PeopleServiceImpl implements PeopleService {

	private static final Logger log = LoggerFactory.getLogger(PeopleServiceImpl.class);
	
	@Override
	@Cacheable( RedisKeyPrefix.DEMOPREFIX + "#id" )
	public People show(String id) {
		
		log.info("show 从数据库取数据！");
        People people = new People();
        people.setUserName("tony");
        people.setSex("male");
        people.setHobby("basketball");
        
		return people;
	}

	@Override
	@demo.redis.Cacheable( key = "#id", expire = ExpireTime.FIVE_MIN )
	public People show1(String id) {
		
		log.info("show1 从数据库取数据！");
        People people = new People();
        people.setUserName("jessy");
        people.setSex("female");
        people.setHobby("football");
        
		return people;
	}

}
