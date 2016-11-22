package ndm.miniwms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ndm.miniwms.dao.CompanyDetailsMapper;
import ndm.miniwms.pojo.CompanyDetails;
import ndm.miniwms.serviceImpl.ICompanyServiceImpl;

@Service
public class CompanyService implements ICompanyServiceImpl{

	@Resource
	private CompanyDetailsMapper companyMapper;
	
	@Override
	public List<CompanyDetails> all() {
		return companyMapper.all();
	}

	@Override
	public void update(CompanyDetails companyDetails) {
		companyMapper.update(companyDetails);
	}

	@Override
	public void add(CompanyDetails companyDetails) {
		companyMapper.add(companyDetails);
	}

	@Override
	public void delete(Integer id) {
		companyMapper.delById(id);
	}

	@Override
	public void selectById(Integer id) {
		companyMapper.selectById(id);
	}

	@Override
	public void selectTab() {
		Integer pageNo = 1;
		Integer pageSize = 3;
		PageHelper.startPage(pageNo, pageSize);
	    List<CompanyDetails> list = companyMapper.selectTab();
	    //用PageInfo对结果进行包装
	    PageInfo<CompanyDetails> page = new PageInfo<CompanyDetails>(list);
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
