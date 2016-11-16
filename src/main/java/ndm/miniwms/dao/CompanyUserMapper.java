package ndm.miniwms.dao;

import java.util.List;

import ndm.miniwms.pojo.CompanyDetails;
import ndm.miniwms.pojo.CompanyUser;

public interface CompanyUserMapper {
	List<CompanyUser> all();

	int delById(Integer id);

	int update(CompanyUser companyUser);

	int add(CompanyUser companyUser);
}
