package demo.mapper;

import java.util.List;

import demo.domain.BlogType;

public interface BlogTypeMapper {

	List<BlogType> getAll();

    BlogType getOne(String btId);

    void  insert(BlogType type);

    void update(BlogType type);

    void  delete(String btId);
}
