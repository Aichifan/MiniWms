package ndm.miniwms.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ndm.miniwms.dao.BrandDetailsMapper;
import ndm.miniwms.pojo.BrandDetails;
import ndm.miniwms.pojo.CompanyDetails;
import ndm.miniwms.serviceImpl.IBrandServiceImpl;

@Service
public class BrandService implements IBrandServiceImpl{

	@Resource
	private BrandDetailsMapper brandMapper;
	
	@Resource
	private DataSource dataSource;
	
	@Override
	public List<BrandDetails> all() {
		return brandMapper.all();
	}

	@Override
	public void update(BrandDetails brand) {
		brandMapper.update(brand);
	}

	@Override
	public void add(BrandDetails brand) {
		brandMapper.add(brand);
	}

	@Override
	public void delete(Integer id) {
		brandMapper.delById(id);
	}

	@Override
	public void selectById(Integer id) {
		brandMapper.selectById(id);
	}

	@Override
	public void selectTab() {
		Integer pageNo = 1;
		Integer pageSize = 3;
		PageHelper.startPage(pageNo, pageSize);
	    List<BrandDetails> list = brandMapper.selectTab();
	    //用PageInfo对结果进行包装
	    PageInfo<BrandDetails> page = new PageInfo<BrandDetails>(list);
	    //测试PageInfo全部属性
	    System.out.println(page.getPageNum());
	    System.out.println(page.getPageSize());
	    System.out.println(page.getStartRow());
	    System.out.println(page.getEndRow());
	    System.out.println(page.getTotal());
	    System.out.println(page.getPages());
	    System.out.println(page.getFirstPage());
	    System.out.println(page.getLastPage());
	    System.out.println(page.isHasPreviousPage());
	    System.out.println(page.isHasNextPage());
	}
}
