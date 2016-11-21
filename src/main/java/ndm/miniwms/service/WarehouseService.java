package ndm.miniwms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ndm.miniwms.dao.WarehouseMapper;
import ndm.miniwms.pojo.CompanyDetails;
import ndm.miniwms.pojo.Warehouse;
import ndm.miniwms.serviceImpl.IWarehouseServiceImpl;

@Service
public class WarehouseService implements IWarehouseServiceImpl{

	@Resource
	private WarehouseMapper warehouseMapper;
	
	@Override
	public List<Warehouse> all() {
		return warehouseMapper.all();
	}

	@Override
	public void update(Warehouse warehouse) {
		warehouseMapper.update(warehouse);
	}

	@Override
	public void add(Warehouse warehouse) {
		warehouseMapper.add(warehouse);
	}

	@Override
	public void delete(Integer id) {
		warehouseMapper.delById(id);
	}

	@Override
	public void selectById(Integer id) {
		warehouseMapper.selectById(id);
	}

	@Override
	public void selectTab() {
		Integer pageNo = 1;
		Integer pageSize = 3;
		PageHelper.startPage(pageNo, pageSize);
	    List<Warehouse> list = warehouseMapper.selectTab();
	    //用PageInfo对结果进行包装
	    PageInfo<Warehouse> page = new PageInfo<Warehouse>(list);
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
