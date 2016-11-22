package ndm.miniwms.serviceImpl;

import java.util.List;

import ndm.miniwms.pojo.CompanyUser;

public interface IUserServiceImpl {

	public List<CompanyUser> all();

	public void update(CompanyUser user);

	public void add(CompanyUser user);

	public void delete(Integer id);

	public void selectById(Integer id);

	public void selectTab();
}
