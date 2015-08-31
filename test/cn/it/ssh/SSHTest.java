package cn.it.ssh;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.it.shop.model.Category;
import cn.it.shop.service.CategoryService;
import cn.it.shop.service.impl.CategoryServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext-*.xml")
public class SSHTest {
	
	@Resource
	private Date date;
	
	// 测试 Spring IOC 的开发环境
	@Test
	public void date(){
		System.out.println(date);
	}
	
	// 测试 Hibernate 的开发环境,因为没有整合，所以直接 new
	@Test
	public void hibernate(){
		CategoryService categoryService = new CategoryServiceImpl();
		categoryService.save(new Category("男男", true));
	}
}
