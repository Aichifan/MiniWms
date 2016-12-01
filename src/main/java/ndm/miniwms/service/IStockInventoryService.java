package ndm.miniwms.service;

import java.util.List;

import ndm.miniwms.pojo.StockInventory;
import ndm.miniwms.vo.TableModelVO;

public interface IStockInventoryService {

	List<StockInventory> all();

	int delById(Integer id);

	int update(StockInventory stockInventory);

	int add(StockInventory stockInventory);

	StockInventory selectById(Integer id);

	List<StockInventory> selectTab(TableModelVO tableModelVO);

	StockInventory selectItem(Integer itemId);

	int updateQuantity(StockInventory stockInventory);
}
