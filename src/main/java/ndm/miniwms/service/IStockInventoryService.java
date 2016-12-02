package ndm.miniwms.service;

import java.util.List;

import ndm.miniwms.pojo.StockInventory;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;


public interface IStockInventoryService {

	List<StockInventory> all();

	int delById(Integer id);

	int update(StockInventory stockInventory);
	
	public int add(StockInventory stockInventory);

	public int delete(Integer id);

	public StockInventory selectById(Integer id);

	public Pagination<StockInventory> selectTab(TableModel table);
}
