package ndm.miniwms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ndm.miniwms.dao.SupplierDetailsMapper;
import ndm.miniwms.pojo.LocationDetails;
import ndm.miniwms.pojo.SupplierDetails;
import ndm.miniwms.serviceImpl.ISupplierServiceImpl;

@Service
public class SupplierService implements ISupplierServiceImpl{

	@Resource
	private SupplierDetailsMapper supplierMapper;
	
	@Override
	public List<SupplierDetails> all() {
		return supplierMapper.all();
	}

	@Override
	public void update(SupplierDetails supplier) {
		supplierMapper.update(supplier);
	}

	@Override
	public void add(SupplierDetails supplier) {
		supplierMapper.add(supplier);
	}

	@Override
	public void delete(Integer id) {
		supplierMapper.delById(id);
	}

	@Override
	public void selectById(Integer id) {
		supplierMapper.selectById(id);
	}

	@Override
	public void selectTab() {
		Integer pageNo = 1;
		Integer pageSize = 3;
		PageHelper.startPage(pageNo, pageSize);
	    List<SupplierDetails> list = supplierMapper.selectTab();
	    //用PageInfo对结果进行包装
	    PageInfo<SupplierDetails> page = new PageInfo<SupplierDetails>(list);
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
