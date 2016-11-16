package ndm.miniwms.dao;

import java.util.List;

import ndm.miniwms.pojo.StockIn;

public interface StockInMapper {
	List<StockIn> all();
	
	int delById(Integer id);
	
	int update(StockIn stockIn);
	
	int add(StockIn stockIn);
}
