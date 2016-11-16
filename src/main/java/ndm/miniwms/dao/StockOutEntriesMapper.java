package ndm.miniwms.dao;

import java.util.List;

import ndm.miniwms.pojo.StockOutEntries;

public interface StockOutEntriesMapper {
	
	List<StockOutEntries> all();
	
	int delById(Integer id);
	
	int update(StockOutEntries stockOutEntries);
	
	int add(StockOutEntries stockOutEntries);
}
