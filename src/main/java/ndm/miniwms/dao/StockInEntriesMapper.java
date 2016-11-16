package ndm.miniwms.dao;

import java.util.List;

import ndm.miniwms.pojo.StockInEntries;

public interface StockInEntriesMapper {
	List<StockInEntries> all();
	
	int delById(Integer id);
	
	int update(StockInEntries stockInEntries);
	
	int add(StockInEntries stockInEntries);
}
