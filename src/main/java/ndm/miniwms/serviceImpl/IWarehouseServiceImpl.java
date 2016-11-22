package ndm.miniwms.serviceImpl;

import java.util.List;

import ndm.miniwms.pojo.Warehouse;

public interface IWarehouseServiceImpl {
	public List<Warehouse> all();

	public void update(Warehouse warehouse);

	public void add(Warehouse warehouse);

	public void delete(Integer id);

	public void selectById(Integer id);

	public void selectTab();
}
