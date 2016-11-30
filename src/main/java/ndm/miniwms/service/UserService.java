package ndm.miniwms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ndm.miniwms.dao.CompanyUserMapper;
import ndm.miniwms.pojo.CompanyDetails;
import ndm.miniwms.pojo.CompanyUser;
import ndm.miniwms.pojo.SupplierDetails;
import ndm.miniwms.serviceImpl.IUserServiceImpl;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

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
	public Pagination<CompanyUser> selectTab(TableModel tm) {
		PageHelper.startPage(tm.getStart()/tm.getLength() + 1, tm.getLength());
	    List<CompanyUser> list = userMapper.selectTab();
	    //��PageInfo�Խ�����а�װ
	    PageInfo<CompanyUser> page = new PageInfo<CompanyUser>(list);
	    //����PageInfoȫ������
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
	    
	    Pagination<CompanyUser> pag=new Pagination<>();
		pag.setData(list);
		pag.setRecordsTotal((int) page.getTotal());
		pag.setRecordsFiltered((int) page.getTotal());
		
	    return pag;
	}

}
