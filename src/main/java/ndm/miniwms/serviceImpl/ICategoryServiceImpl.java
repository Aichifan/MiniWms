package ndm.miniwms.serviceImpl;

import java.util.List;

import ndm.miniwms.pojo.CategoryDetails;

public interface ICategoryServiceImpl {
	public List<CategoryDetails> all();

	public void update(CategoryDetails categoryDetails);

	public void add(CategoryDetails categoryDetails);

	public void delete(Integer id);

	public void selectById(Integer id);

	public void selectTab();
}
