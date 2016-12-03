package ndm.miniwms.controller;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ndm.miniwms.pojo.StockInventory;
import ndm.miniwms.service.IStockInventoryService;
import ndm.miniwms.vo.Message;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.StockInventoryVO;
import ndm.miniwms.vo.TableModelVO;
import net.sf.jxls.transformer.XLSTransformer;

@Controller
@RequestMapping(value = "/stockInventory")
public class StockInventoryController {
	@Resource
	private IStockInventoryService service;
	
	@RequestMapping(value = "/all",method = RequestMethod.GET)
	@ResponseBody
	public List<StockInventory> all(){
		return this.service.all();
	}
	
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> insert(StockInventory stockInventory){
		this.service.add(stockInventory);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/page",method = RequestMethod.GET)
	@ResponseBody
	public Pagination<StockInventoryVO> selectTab(TableModelVO tableModelVO){
		TableModelVO tableModelVO1 = new TableModelVO();
		tableModelVO1.setDraw(tableModelVO.getDraw());
		tableModelVO1.setLength(tableModelVO.getLength());
		tableModelVO1.setStart(tableModelVO.getStart()/10+1);
		List<StockInventory> list = service.selectTab(tableModelVO1);
		List<StockInventoryVO> stockInventoryVOs = new ArrayList<>();
		for(StockInventory stockInventory : list){
			StockInventoryVO stockInventoryVO = new StockInventoryVO(stockInventory);
			stockInventoryVO.setCompanyName(stockInventory.getCompanyDetails().getName());
			stockInventoryVO.setInName(stockInventory.getStockIn().getDescription());
			stockInventoryVO.setItemName(stockInventory.getStockItem().getName());
			stockInventoryVO.setLastOperatorName(stockInventory.getCompanyUser().getUsername());
			stockInventoryVO.setLocationName(stockInventory.getLocationDetails().getName());
			stockInventoryVOs.add(stockInventoryVO);
		}
		Pagination<StockInventoryVO> pagination = new Pagination<>();
		pagination.setData(stockInventoryVOs);
		pagination.setDraw(tableModelVO.getDraw());
		pagination.setRecordsTotal(service.all().size());
		pagination.setRecordsFiltered(service.all().size());
		return pagination;
	}
	
	 @RequestMapping("/export")
	 @ResponseBody
	    public void export(HttpServletRequest request,HttpServletResponse response){
		 String path = "/doc/dataSourceTemplate/stockInventory.xlsx";
	        String templateFileName= this.getClass().getResource(path).getFile();
	        System.out.println(templateFileName);
	        String destFileName= "stockInventory.xls";
	        //模拟数据
	        List<StockInventory> staff = service.all();
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");  
	        
	        Map<String,Object> beans = new HashMap<String,Object>();
	        beans.put("dateFormat", dateFormat);
	        beans.put("employees", staff);
	        XLSTransformer transformer = new XLSTransformer();
	        InputStream in=null;
	        OutputStream out=null;
	        //设置响应
	        response.setHeader("Content-Disposition", "attachment;filename=" + destFileName);
	        response.setContentType("application/vnd.ms-excel");
	        try {
	            in=new BufferedInputStream(new FileInputStream(templateFileName));
	            Workbook workbook=transformer.transformXLS(in, beans);
	            out=response.getOutputStream();
	            //将内容写入输出流并把缓存的内容全部发出去
	            workbook.write(out);
	            out.flush();
	        } catch (InvalidFormatException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (in!=null){try {in.close();} catch (IOException e) {}}
	            if (out!=null){try {out.close();} catch (IOException e) {}}
	        }
	    }
}
