package ndm.miniwms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ndm.miniwms.dao.CategoryDetailsMapper;
import ndm.miniwms.pojo.CategoryDetails;
import ndm.miniwms.pojo.CompanyDetails;
import ndm.miniwms.serviceImpl.ICategoryServiceImpl;

@Service
public class CategoryService implements ICategoryServiceImpl{

	@Resource
	private CategoryDetailsMapper categoryMapper;
	
	@Override
	public List<CategoryDetails> all() {
		return categoryMapper.all();
	}

	@Override
	public void update(CategoryDetails categoryDetails) {
		categoryMapper.update(categoryDetails);
	}

	@Override
	public void add(CategoryDetails categoryDetails) {
		categoryMapper.add(categoryDetails);
	}

	@Override
	public void delete(Integer id) {
		categoryMapper.delById(id);
	}

	@Override
	public void selectById(Integer id) {
		categoryMapper.selectById(id);
	}

	@Override
	public void selectTab() {
		Integer pageNo = 1;
		Integer pageSize = 3;
		PageHelper.startPage(pageNo, pageSize);
	    List<CategoryDetails> list = categoryMapper.selectTab();
	    //用PageInfo对结果进行包装
	    PageInfo<CategoryDetails> page = new PageInfo<CategoryDetails>(list);
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
