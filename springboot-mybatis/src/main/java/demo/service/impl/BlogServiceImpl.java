package demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.domain.BlogType;
import demo.mapper.BlogTypeMapper;
import demo.service.BlogService;

@Service
public class BlogServiceImpl implements BlogService  {

	@Autowired
    private BlogTypeMapper blogTypeMapper;
	
	@Override
	public List<BlogType> queryBlogType() {
		return blogTypeMapper.getAll();
	}

}
