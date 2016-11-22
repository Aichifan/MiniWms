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

import ndm.miniwms.dao.WarehouseMapper;
import ndm.miniwms.pojo.Warehouse;
import ndm.miniwms.vo.Message;

@Controller
public class WarehouseController {
	
	@Resource
	private WarehouseMapper warehouseMapper;
	
	@RequestMapping(value="/warehouse/all",method = RequestMethod.GET)
	@ResponseBody
	public List<Warehouse> all(){
		return warehouseMapper.all();
	}
	
	@RequestMapping(value="/warehouse/add",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> insert(Warehouse warehouse){
		warehouseMapper.add(warehouse);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/warehouse/upt",method = RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<Message> update(Warehouse warehouse){
		warehouseMapper.update(warehouse);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/warehouse/del",method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<Message> delete(Integer id){
		warehouseMapper.delById(id);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/warehouse/{id}",method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Message> selectById(@PathVariable ("id") Integer id){
		warehouseMapper.selectById(id);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/warehouse/page",method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Message> selectTab(){
		warehouseMapper.selectTab();
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
}
