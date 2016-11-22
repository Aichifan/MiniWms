package ndm.miniwms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ndm.miniwms.dao.ConsigneeDetailsMapper;
import ndm.miniwms.pojo.CompanyDetails;
import ndm.miniwms.pojo.ConsigneeDetails;
import ndm.miniwms.serviceImpl.IConsigneeServiceImpl;

@Service
public class ConsigneeService implements IConsigneeServiceImpl{

	@Resource
	private ConsigneeDetailsMapper consigneeMapper;
	
	@Override
	public List<ConsigneeDetails> all() {
		return consigneeMapper.all();
	}

	@Override
	public void update(ConsigneeDetails consigneeDetails) {
		consigneeMapper.update(consigneeDetails);
	}

	@Override
	public void add(ConsigneeDetails consigneeDetails) {
		consigneeMapper.add(consigneeDetails);
	}

	@Override
	public void delete(Integer id) {
		consigneeMapper.delById(id);
	}

	@Override
	public void selectById(Integer id) {
		consigneeMapper.selectById(id);
	}

	@Override
	public void selectTab() {
		Integer pageNo = 1;
		Integer pageSize = 3;
		PageHelper.startPage(pageNo, pageSize);
	    List<ConsigneeDetails> list = consigneeMapper.selectTab();
	    //用PageInfo对结果进行包装
	    PageInfo<ConsigneeDetails> page = new PageInfo<ConsigneeDetails>(list);
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
