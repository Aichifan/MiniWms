package ndm.miniwms.service;

import java.util.List;

import ndm.miniwms.pojo.CompanyRole;
import ndm.miniwms.pojo.RoleHasMenu;

public interface IRoleService {
	List<CompanyRole> all();

	int delById(Integer id);

	int update(CompanyRole companyRole);

	int add(CompanyRole companyRole);
	
	CompanyRole selectById(Integer id);
	
	int delByRoleId(Integer id);
	
	int addRoleMenu(CompanyRole companyRole);
}
