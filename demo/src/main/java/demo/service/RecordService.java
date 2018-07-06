package demo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import demo.domain.Record;
import demo.rabbitmq.producer.Producer;

@Service
public class RecordService {

	private static final Logger log = LoggerFactory.getLogger(RecordService.class);
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Value("${myqueue}")
	String queue;

	@Bean
	Queue queue(){
	        return new Queue(queue,false);
	 }

	@Autowired
	Producer producer;

	public void  sendMsg(String msg){
	        producer.sendTo(queue,  msg+" at " + new Date());
	 }
	
	public void insertData(){
		
		log.info("> Table creation");

        jdbcTemplate.execute("DROP TABLE IF EXISTS RECORD");
        jdbcTemplate.execute("CREATE TABLE RECORD(id SERIAL, title VARCHAR(255),summary VARCHAR(255), created TIMESTAMP)");
        log.info("> Inserting data...");
        jdbcTemplate.execute("INSERT INTO RECORD(title,summary,created) VALUES('Get to know Spring Boot','Today I will learn Spring Boot','2016-01-01 00:00:00.00')");
        jdbcTemplate.execute("INSERT INTO RECORD(title,summary,created) VALUES('Simple Spring Boot Project','I will do my first Spring Boot project','2016-01-02 00:00:00.00')");
        jdbcTemplate.execute("INSERT INTO RECORD(title,summary,created) VALUES('Spring Boot Reading','Read more about Spring Boot','2016-02-01 00:00:00.00')");
        jdbcTemplate.execute("INSERT INTO RECORD(title,summary,created) VALUES('Spring Boot in the Cloud','Learn Spring Boot using Cloud Foundry','2016-01-01 00:00:00.00')");
        jdbcTemplate.execute("INSERT INTO RECORD(title,summary,created) VALUES('Spring Boot By Ron','Learn Spring Boot using Cloud Foundry','2016-01-01 00:00:00.00')");

        log.info("> Done.");
		
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Record> findAll() {
        List<Record> entries = new ArrayList<>();

        entries = jdbcTemplate.query("select * from RECORD",new Object[]{},new BeanPropertyRowMapper(Record.class));

        List<Map<String, Object>> map = jdbcTemplate.query("select * from RECORD",new Object[]{}, new ColumnMapRowMapper());
        log.info("record map" + map.toString());
        
        if(entries!=null && entries.size()>0){
            return entries;
        }else{
            return null;
        }
    }
	
	
}
