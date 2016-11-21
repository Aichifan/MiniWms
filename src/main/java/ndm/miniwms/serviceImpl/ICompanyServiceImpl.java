package ndm.miniwms.serviceImpl;

import java.util.List;

import ndm.miniwms.pojo.CompanyDetails;

public interface ICompanyServiceImpl {
	public List<CompanyDetails> all();

	public void update(CompanyDetails companyDetails);

	public void add(CompanyDetails companyDetails);

	public void delete(Integer id);

	public void selectById(Integer id);

	public void selectTab();
}
