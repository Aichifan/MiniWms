package ndm.miniwms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ndm.miniwms.dao.LocationDetailsMapper;
import ndm.miniwms.pojo.CompanyDetails;
import ndm.miniwms.pojo.LocationDetails;
import ndm.miniwms.serviceImpl.ILocationServiceImpl;

@Service
public class LocationService implements ILocationServiceImpl{

	@Resource
	private LocationDetailsMapper locationMapper;
	
	@Override
	public List<LocationDetails> all() {
		return locationMapper.all();
	}

	@Override
	public void update(LocationDetails locationDetails) {
		locationMapper.update(locationDetails);
	}

	@Override
	public void add(LocationDetails locationDetails) {
		locationMapper.add(locationDetails);
	}

	@Override
	public void delete(Integer id) {
		locationMapper.delById(id);
	}

	@Override
	public void selectById(Integer id) {
		locationMapper.selectById(id);
	}

	@Override
	public void selectTab() {
		Integer pageNo = 1;
		Integer pageSize = 3;
		PageHelper.startPage(pageNo, pageSize);
	    List<LocationDetails> list = locationMapper.selectTab();
	    //用PageInfo对结果进行包装
	    PageInfo<LocationDetails> page = new PageInfo<LocationDetails>(list);
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
