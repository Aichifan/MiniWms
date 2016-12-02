package ndm.miniwms.service;

import java.util.List;

import ndm.miniwms.pojo.StockInventory;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;


public interface IStockInventoryService {

	List<StockInventory> all();

	int delById(Integer id);

	int update(StockInventory stockInventory);
<<<<<<< HEAD
	
	public int add(StockInventory stockInventory);

	public int delete(Integer id);

	public StockInventory selectById(Integer id);

	public Pagination<StockInventory> selectTab(TableModel table);
=======

	int add(StockInventory stockInventory);

	StockInventory selectById(Integer id);

	List<StockInventory> selectTab(TableModelVO tableModelVO);

	StockInventory selectItem(Integer itemId);

	int updateQuantity(StockInventory stockInventory);
>>>>>>> cuiyuanhang
}
