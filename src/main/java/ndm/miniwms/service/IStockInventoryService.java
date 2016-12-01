package ndm.miniwms.service;

import java.util.List;

import ndm.miniwms.pojo.StockInventory;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

public interface IStockInventoryService {
	public List<StockInventory> all();

	public void update(StockInventory stockInventory);

	public void add(StockInventory stockInventory);

	public void delete(Integer id);

	public void selectById(Integer id);

	public Pagination<StockInventory> selectTab(TableModel table);
}
