package ndm.miniwms.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ndm.miniwms.pojo.StockInventory;
import ndm.miniwms.service.impl.StockInventoryServiceImpl;
import ndm.miniwms.vo.Message;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

@Controller
public class StockInventoryController {
	
	@Resource
	private StockInventoryServiceImpl stockInventoryService;
	
	@RequestMapping(value="/stockInventory/all",method = RequestMethod.GET)
	@ResponseBody
	public List<StockInventory> all(){
		return stockInventoryService.all();
	}
	
	@RequestMapping(value="/stockInventory/add",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> insert(StockInventory stockInventory){
		stockInventoryService.add(stockInventory);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/stockInventory/upt",method = RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<Message> update(StockInventory stockInventory){
		stockInventoryService.update(stockInventory);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/stockInventory/del",method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<Message> delete(Integer id){
		stockInventoryService.delete(id);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/stockInventory/{id}",method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Message> selectById(@PathVariable ("id") Integer id){
		stockInventoryService.selectById(id);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/stockInventory/page",method = RequestMethod.GET)
	@ResponseBody
	public Pagination<StockInventory> selectTab(TableModel table){
		return stockInventoryService.selectTab(table);
	}
}
