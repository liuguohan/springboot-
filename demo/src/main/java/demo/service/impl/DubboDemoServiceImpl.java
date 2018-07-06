package demo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import demo.service.DubboDemoService;

@Service("dubboDemoService")
public class DubboDemoServiceImpl implements DubboDemoService {
	
	public static final Logger log = LoggerFactory.getLogger(DubboDemoServiceImpl.class);

	@Override
	public void example() {
		log.info("dubbo test >>>");
	}

}
