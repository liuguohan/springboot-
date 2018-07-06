package demo.redis;

/*import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.MapPropertySource;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

import redis.clients.jedis.JedisPoolConfig;*/

public class RedisClusterConf {

	/*private static final Logger logger = LoggerFactory.getLogger(RedisClusterConf.class);

	@Value("${redis.cluster.nodes}")
	private String clusterNodes;

	// Redis服务器地址
	@Value("${redis.host}")
	private String host;
	
	// Redis服务器连接端口
	@Value("${redis.port}")
	private int port;
	
	// Redis服务器连接密码（默认为空）
	@Value("${redis.password}")
	private String password;
	
	// 连接超时时间（毫秒）
	@Value("${redis.timeout}")
	private int timeout;
	
	// Redis数据库索引（默认为0）
	@Value("${redis.database}")
	private int database;
	
	// 连接池最大连接数（使用负值表示没有限制）
	@Value("${redis.pool.max-active}")
	private int maxTotal;
	
	// 连接池最大阻塞等待时间（使用负值表示没有限制）
	@Value("${redis.pool.max-wait}")
	private int maxWaitMillis;
	
	// 连接池中的最大空闲连接
	@Value("${redis.pool.max-idle}")
	private int maxIdle;
	
	// 连接池中的最小空闲连接
	@Value("${redis.pool.min-idle}")
	private int minIdle;

	@Bean(name = "jedisClusterConfig")
	public RedisClusterConfiguration getClusterConfiguration() {
		
		Map<String, Object> source = new HashMap<String, Object>();
		source.put("spring.redis.cluster.nodes", clusterNodes);
		source.put("spring.redis.cluster.timeout", timeout);
		source.put("spring.redis.cluster.max-redirects", 5);
	
		return new RedisClusterConfiguration(new MapPropertySource("RedisClusterConfiguration", source));
	}

	*//**
	* 配置JedisPoolConfig
	* @return JedisPoolConfig实体
	*//*
	@Bean(name = "jedisPoolConfig")
	public JedisPoolConfig jedisPoolConfig() {
		
		logger.info("=== XXX RedisConf jedisPoolConfig 初始化JedisPoolConfi ===");
		
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		// 连接池最大连接数（使用负值表示没有限制）
		jedisPoolConfig.setMaxTotal(this.maxTotal);
		// 连接池最大阻塞等待时间（使用负值表示没有限制）
		jedisPoolConfig.setMaxWaitMillis(this.maxWaitMillis);
		// 连接池中的最大空闲连接
		jedisPoolConfig.setMaxIdle(this.maxIdle);
		// 连接池中的最小空闲连接
		jedisPoolConfig.setMinIdle(this.minIdle);
		// jedisPoolConfig.setTestOnBorrow(true);
		// jedisPoolConfig.setTestOnCreate(true);
		// jedisPoolConfig.setTestWhileIdle(true);
		
		return jedisPoolConfig;
	}

	*//**
	* 实例化 RedisConnectionFactory 对象
	* @param poolConfig
	* @return
	*//*
	@Bean(name = "jedisConnectionFactory")
	public RedisConnectionFactory jedisConnectionFactory(@Qualifier(value = "jedisClusterConfig") RedisClusterConfiguration poolConfig) {
		
		logger.info("=== XXX RedisConf jedisConnectionFactory 初始化JedisPoolConfi ===");
		
		JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(poolConfig);
		
		jedisConnectionFactory.setHostName(this.host);
		jedisConnectionFactory.setPort(this.port);
		jedisConnectionFactory.setDatabase(this.database);
		jedisConnectionFactory.setTimeout(this.timeout);
		
		return jedisConnectionFactory;
	}

	*//**
	* 实例化 RedisTemplate 对象
	* @return
	*//*
	@Bean(name = "redisTemplate")
	public RedisTemplate<String, String> functionDomainRedisTemplate(@Qualifier(value = "jedisConnectionFactory") RedisConnectionFactory factory) {
		
		logger.info("=== XXX RedisConf functionDomainRedisTemplate 初始化JedisPoolConfi ===");
		
		//使用Jackson2JsonRedisSerializer来序列化和反序列化redis的value值（默认使用JDK的序列化方式）
	    @SuppressWarnings({ "rawtypes", "unchecked" })
		Jackson2JsonRedisSerializer serializer = new Jackson2JsonRedisSerializer(Object.class);
	
	    ObjectMapper mapper = new ObjectMapper();
	    mapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
	    mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
	    serializer.setObjectMapper(mapper);
		
		RedisTemplate<String, String> redisTemplate = new RedisTemplate<>();
		
		redisTemplate.setConnectionFactory(factory);
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		redisTemplate.setHashKeySerializer(new StringRedisSerializer());
		redisTemplate.setHashValueSerializer(serializer);
		redisTemplate.setValueSerializer(serializer);
		redisTemplate.afterPropertiesSet();
		redisTemplate.setEnableTransactionSupport(true);
		
		return redisTemplate;
	}*/
	
}
