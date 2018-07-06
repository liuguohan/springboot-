package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.mapper.BlogTypeMapper;

@Controller
public class BlogTypeController {

	@Autowired
	BlogTypeMapper mapper;
	
	@RequestMapping("/blogtype")
	@ResponseBody
	public String index() {
		return mapper.getAll().toString();
	}
	
}
