package ndm.miniwms.dao;

import java.util.List;

import ndm.miniwms.pojo.CategoryDetails;
import ndm.miniwms.pojo.CompanyDetails;

public interface CategoryDetailsMapper {
	List<CategoryDetails> all();

	int delById(Integer id);

	int update(CategoryDetails categoryDetails);

	int add(CategoryDetails categoryDetails);
}
