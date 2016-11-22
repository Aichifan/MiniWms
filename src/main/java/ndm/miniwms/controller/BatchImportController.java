package ndm.miniwms.controller;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import ndm.miniwms.service.BatchImportService;
import ndm.miniwms.vo.Message;

@Controller
public class BatchImportController {
	
	@Resource
	private BatchImportService BatchImportService;
	
	@RequestMapping(value = "/batchImport/brand",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> brandAdd(@RequestParam("brand") CommonsMultipartFile brand){
		BatchImportService.addBrand(brand);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/batchImport/category",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> categoryAdd(@RequestParam("category") CommonsMultipartFile category){
		BatchImportService.addCategory(category);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/batchImport/company",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> companyAdd(@RequestParam("company") CommonsMultipartFile company){
		BatchImportService.addCompany(company);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/batchImport/consignee",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> consigneeAdd(@RequestParam("consignee") CommonsMultipartFile consignee){
		BatchImportService.addConsignee(consignee);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/batchImport/location",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> locationAdd(@RequestParam("location") CommonsMultipartFile location){
		BatchImportService.addLocation(location);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/batchImport/supplier",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> supplierAdd(@RequestParam("supplier") CommonsMultipartFile supplier){
		BatchImportService.addSupplier(supplier);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/batchImport/user",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> userAdd(@RequestParam("user") CommonsMultipartFile user){
		BatchImportService.addUser(user);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/batchImport/warehouse",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> warehouseAdd(@RequestParam("warehouse") CommonsMultipartFile warehouse){
		BatchImportService.addWarehouse(warehouse);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
}
