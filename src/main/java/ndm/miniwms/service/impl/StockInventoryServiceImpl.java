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
	public int update(StockInventory stockInventory) {
		return stockInventoryMapper.update(stockInventory);
	}

	@Override
	public int add(StockInventory stockInventory) {
		return stockInventoryMapper.add(stockInventory);
	}

	@Override
	public int delete(Integer id) {
		return stockInventoryMapper.delById(id);
	}

	@Override
	public StockInventory selectById(Integer id) {
		return stockInventoryMapper.selectById(id);
	}

	@Override
	public Pagination<StockInventory> selectTab(TableModel table) {
		PageHelper.startPage(table.getStart()/table.getLength() + 1,table.getLength());
	    List<StockInventory> list = stockInventoryMapper.all();
	    Pagination<StockInventory> pagination = new Pagination<>();
	    //��PageInfo�Խ�����а�װ
	    PageInfo<StockInventory> page = new PageInfo<StockInventory>(list);
	    //����PageInfoȫ������
	    int total = (int)page.getTotal();
	    pagination.setDraw(table.getDraw());
	    pagination.setRecordsFiltered(this.all().size());
	    pagination.setRecordsTotal(total);
	    pagination.setData(list);
	    return pagination;
	}

    @Override
    public int delById(Integer id) {
        return this.delete(id);
    }


}
