package demo.dao;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

@Repository
public class RedisDao {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	public void set(String key, String value) {
		ValueOperations<String, String> valueOpt = stringRedisTemplate.opsForValue();
		valueOpt.set(key, value, 1 , TimeUnit.MINUTES);
	}
	
	public String get(String key) {
		ValueOperations<String, String> valueOpt = stringRedisTemplate.opsForValue();
		return valueOpt.get(key);
	}
	
}
