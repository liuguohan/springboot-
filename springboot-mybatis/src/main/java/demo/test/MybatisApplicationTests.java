package demo.test;

//import java.util.Date;
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import demo.domain.BlogType;
//import demo.mapper.BlogTypeMapper;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
public class MybatisApplicationTests {

	/*@Autowired
	private BlogTypeMapper blogTypeMapper;
	
	@Test
    public void testInsert() {
        System.out.println("----------测试插入------");
        BlogType type=new BlogType();
        type.setBtId("455550e8ba444f8aabdd696a0976a6bc");
        type.setTypeTxt("Spring Boot MyBatis 实例讲解");
        type.setUserId("80bda1819d4a4619b44750bfc3013183");
        type.setCrtTime(new Date());
        blogTypeMapper.insert(type);

        type.setBtId("455550e8ba444f8aabdd696a0976a6ba");
        type.setTypeTxt("Spring Boot系列");
        blogTypeMapper.insert(type);

        type.setBtId("455550e8ba444f8aabdd696a0976a6bb");
        type.setTypeTxt("Spring Boot系列哈哈哈");
        blogTypeMapper.insert(type);

        testQuery();
    }

    @Test
    public void  testUpdate(){
        System.out.println("----------测试更新------");
        BlogType type=blogTypeMapper.getOne("455550e8ba444f8aabdd696a0976a6bb");
        type.setTypeTxt("学习Spring Boot Mybatis");
        blogTypeMapper.update(type);

        type = blogTypeMapper.getOne("455550e8ba444f8aabdd696a0976a6bb");

        System.out.println(type.getBtId()+"------>"+type.getTypeTxt());
    }

    @Test
    public void  testQuery(){
        List<BlogType> list=blogTypeMapper.getAll();

        System.out.println("----------查询数据------");
//        list.stream().forEach(item->{
//            System.out.println(item.getBtId()+"------>"+item.getTypeTxt());
//        });
        for(BlogType item : list) {
        	System.out.println(item.getBtId()+"------>"+item.getTypeTxt());
        }
    }

    @Test
    public void testDelete(){
        System.out.println("----------测试删除------");
        blogTypeMapper.delete("455550e8ba444f8aabdd696a0976a6bb");
        testQuery();
    }*/
	
}
