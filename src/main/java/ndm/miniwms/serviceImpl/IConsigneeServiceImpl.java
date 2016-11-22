package ndm.miniwms.serviceImpl;

import java.util.List;

import ndm.miniwms.pojo.ConsigneeDetails;

public interface IConsigneeServiceImpl {
	public List<ConsigneeDetails> all();

	public void update(ConsigneeDetails consigneeDetails);

	public void add(ConsigneeDetails consigneeDetails);

	public void delete(Integer id);

	public void selectById(Integer id);

	public void selectTab();
}
