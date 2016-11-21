package ndm.miniwms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ndm.miniwms.dao.CompanyUserMapper;
import ndm.miniwms.pojo.CompanyDetails;
import ndm.miniwms.pojo.CompanyUser;
import ndm.miniwms.serviceImpl.IUserServiceImpl;

@Service
public class UserService implements IUserServiceImpl{

	@Resource
	private CompanyUserMapper userMapper;
	
	@Override
	public List<CompanyUser> all() {
		return userMapper.all();
	}

	@Override
	public void update(CompanyUser user) {
		userMapper.update(user);
	}

	@Override
	public void add(CompanyUser user) {
		userMapper.add(user);
	}

	@Override
	public void delete(Integer id) {
		userMapper.delById(id);
	}

	@Override
	public void selectById(Integer id) {
		userMapper.selectById(id);
	}

	@Override
	public void selectTab() {
		Integer pageNo = 1;
		Integer pageSize = 3;
		PageHelper.startPage(pageNo, pageSize);
	    List<CompanyUser> list = userMapper.selectTab();
	    //用PageInfo对结果进行包装
	    PageInfo<CompanyUser> page = new PageInfo<CompanyUser>(list);
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
