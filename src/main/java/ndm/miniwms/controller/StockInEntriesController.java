package ndm.miniwms.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ndm.miniwms.pojo.StockIn;
import ndm.miniwms.pojo.StockInEntries;
import ndm.miniwms.service.IStockInEntriesService;
import ndm.miniwms.service.IStockInService;
import ndm.miniwms.vo.Message;

@Controller
@RequestMapping("/stockInEntries")
public class StockInEntriesController {

	@Resource
	private IStockInEntriesService service;

	@Resource
	private IStockInService stockInService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> insert(@RequestBody StockInEntries[] stockInEntriesList) {
		for (StockInEntries stockInEntries : stockInEntriesList) {
			StockIn stockIn = new StockIn();
			stockIn.setStatus(false);
			stockInService.add(stockIn);
			List<StockIn> list = stockInService.all();
			int id = list.get(list.size() - 1).getId();
			stockInEntries.setInId(id);
			this.service.add(stockInEntries);
		}
			return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
		
	}
}
