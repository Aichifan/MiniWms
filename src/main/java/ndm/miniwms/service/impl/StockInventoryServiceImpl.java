package ndm.miniwms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ndm.miniwms.dao.StockInventoryMapper;
import ndm.miniwms.pojo.StockInventory;
import ndm.miniwms.service.IStockInventoryService;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

@Service
public class StockInventoryServiceImpl implements IStockInventoryService{

	@Resource
	private StockInventoryMapper stockInventoryMapper;
	
	@Override
	public List<StockInventory> all() {
		return stockInventoryMapper.all();
	}

	@Override
	public void update(StockInventory stockInventory) {
		stockInventoryMapper.update(stockInventory);
	}

	@Override
	public void add(StockInventory stockInventory) {
		stockInventoryMapper.add(stockInventory);
	}

	@Override
	public void delete(Integer id) {
		stockInventoryMapper.delById(id);
	}

	@Override
	public void selectById(Integer id) {
		stockInventoryMapper.selectById(id);
	}

	@Override
	public Pagination<StockInventory> selectTab(TableModel table) {
		PageHelper.startPage(table.getStart()/table.getLength() + 1,table.getLength());
	    List<StockInventory> list = stockInventoryMapper.all();
	    Pagination<StockInventory> pagination = new Pagination<>();
	    //用PageInfo对结果进行包装
	    PageInfo<StockInventory> page = new PageInfo<StockInventory>(list);
	    //测试PageInfo全部属性
	    int total = (int)page.getTotal();
	    pagination.setDraw(table.getDraw());
	    pagination.setRecordsFiltered(this.all().size());
	    pagination.setRecordsTotal(total);
	    pagination.setData(list);
	    return pagination;
	}

}
