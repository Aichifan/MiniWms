package ndm.miniwms.serviceImpl;

import java.util.List;

import ndm.miniwms.pojo.CompanyUser;
import ndm.miniwms.pojo.ConsigneeDetails;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

public interface IConsigneeServiceImpl {
	public List<ConsigneeDetails> all();

	public void update(ConsigneeDetails consigneeDetails);

	public void add(ConsigneeDetails consigneeDetails);

	public void delete(Integer id);

	public void selectById(Integer id);

	public Pagination<ConsigneeDetails> selectTab(TableModel tm);
}
