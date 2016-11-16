package mcj;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ndm.miniwms.dao.CategoryDetailsMapper;
import ndm.miniwms.dao.CompanyDetailsMapper;
import ndm.miniwms.dao.CompanyUserMapper;
import ndm.miniwms.dao.LocationDetailsMapper;
import ndm.miniwms.dao.WarehouseMapper;
import ndm.miniwms.pojo.LocationDetails;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"}) 

public class MapperTest {

	@Resource
	CategoryDetailsMapper CategoryDetailsMapper;
	
	@Test
	public void testcompany(){
		System.out.println(CategoryDetailsMapper.all());
	}
}
