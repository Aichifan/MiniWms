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

import ndm.miniwms.dao.LocationDetailsMapper;
import ndm.miniwms.pojo.LocationDetails;
import ndm.miniwms.vo.Message;

@Controller
public class LocationController {
	
	@Resource
	private LocationDetailsMapper locationMapper;
	
	@RequestMapping(value="/location/all",method = RequestMethod.GET)
	@ResponseBody
	public List<LocationDetails> all(){
		return locationMapper.all();
	}
	
	@RequestMapping(value="/location/add",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> insert(LocationDetails locationDetails){
		locationMapper.add(locationDetails);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/location/upt",method = RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<Message> update(LocationDetails locationDetails){
		locationMapper.update(locationDetails);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/location/del",method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<Message> delete(Integer id){
		locationMapper.delById(id);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/location/{id}",method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Message> selectById(@PathVariable ("id") Integer id){
		locationMapper.selectById(id);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/location/page",method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Message> selectTab(){
		locationMapper.selectTab();
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
}
