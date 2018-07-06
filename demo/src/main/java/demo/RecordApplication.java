package demo;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import demo.service.RecordService;

@SpringBootApplication
@MapperScan("demo.mapper")
public class RecordApplication implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(RecordApplication.class);
	
	@Autowired
	RecordService service;
	
	public static void main(String[] args) {
		SpringApplication.run(RecordApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		log.info("@@ Inserting Data....");
        service.insertData();
	}

	
}
