package ndm.miniwms.dao;

import java.util.List;

import ndm.miniwms.pojo.CompanyDetails;

public interface CompanyDetailsMapper {
	List<CompanyDetails> all();

	int delById(Integer id);

	int update(CompanyDetails companyDetails);

	int add(CompanyDetails companyDetails);
}
