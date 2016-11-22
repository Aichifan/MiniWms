package ndm.miniwms.service.impl;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.jxls.reader.ReaderBuilder;
import org.jxls.reader.XLSReadStatus;
import org.jxls.reader.XLSReader;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ndm.miniwms.dao.BrandDetailsMapper;
import ndm.miniwms.dao.CategoryDetailsMapper;
import ndm.miniwms.dao.StockItemMapper;
import ndm.miniwms.dao.StockItemPhotoMapper;
import ndm.miniwms.pojo.BrandDetails;
import ndm.miniwms.pojo.CategoryDetails;
import ndm.miniwms.pojo.StockItem;
import ndm.miniwms.pojo.StockItemPhoto;
import ndm.miniwms.service.StockItemService;
import ndm.miniwms.vo.StockItemVo;

@Service("stockItemService")
public class IStockItemServiceImpl implements StockItemService {

	@Resource
	StockItemMapper stockitemMapper;
	@Resource
	CategoryDetailsMapper categoryDetailsMapper;
	@Resource
	BrandDetailsMapper brandDetailsMapper;
	@Resource
	StockItemPhotoMapper stockItemPhotoMapper;
	
	// 查询所有商品
	@Override
	public List<StockItem> all() {
		return stockitemMapper.all();
	}

	// 添加商品
	@Override
	public int add(StockItemVo stockItemVo) {
		StockItem stockItem = new StockItem(stockItemVo);
		List<CategoryDetails> categList = categoryDetailsMapper.all();
		for(CategoryDetails categoryDetails :categList){
			if (stockItemVo.getCategoryName().equals(categoryDetails.getName())) {
				stockItem.setCategoryId(categoryDetails.getId());
			}
		}
		List<BrandDetails> braList = brandDetailsMapper.all();
		for(BrandDetails bra : braList){
			if (stockItemVo.getBrandName().equals(bra.getName())) {
				stockItem.setBrandId(bra.getId());
			}
		}
		return this.stockitemMapper.add(stockItem);
	}

	// 修改商品
	@Override
	public int update(StockItemVo stockItemVo ,  MultipartFile textFile ,HttpServletRequest request) {
		StockItem stockItem = new StockItem(stockItemVo);
		List<CategoryDetails> categList = categoryDetailsMapper.all();
		if (stockItemVo.getHazardFlagName().equals("否")) {
			stockItem.setHazardFlag(0);
		}else {
			stockItem.setHazardFlag(1);
		}
		for(CategoryDetails categoryDetails :categList){
			if (stockItemVo.getCategoryName().equals(categoryDetails.getName())) {
				stockItem.setCategoryId(categoryDetails.getId());
			}
		}
		List<BrandDetails> braList = brandDetailsMapper.all();
		for(BrandDetails bra : braList){
			if (stockItemVo.getBrandName().equals(bra.getName())) {
				stockItem.setBrandId(bra.getId());
			}
		}
		String path = request.getSession().getServletContext().getRealPath("upload");//获取路径
        System.out.println(path);
        String fileName = textFile.getOriginalFilename();//获取上传文件的名字
        //保存  
        try {  
        	StockItemPhoto stockItemPhoto = new StockItemPhoto();
        	stockItemPhoto.setItemId(stockItem.getId());
        	stockItemPhoto.setPath(path+fileName);
        	stockItemPhotoMapper.add(stockItemPhoto);
        } catch (Exception e) {  
            e.printStackTrace();  
        }
		return this.stockitemMapper.update(stockItem);
} 
		
		


	//刪除商品
	@Override
	public int delById(Integer id) {
		return this.stockitemMapper.delById(id);
	}

	// 根据id查詢商品
	@Override
	public StockItem selectById(Integer id){
		return stockitemMapper.selectById(id);
	}

	//批量添加
	@Override
	public void allStockItem(MultipartFile stoFile) {
		String xmlConfig = "/doc/StockItemExcel.xml";
		InputStream inputXML = new BufferedInputStream(getClass().getResourceAsStream(xmlConfig));
		XLSReader mainReader =null;
		try {
			mainReader = ReaderBuilder.buildFromXML(inputXML);
			BufferedInputStream bis = new BufferedInputStream(stoFile.getInputStream());
			List<StockItemVo> stockItemVos = new ArrayList<>();
			Map<String, Object> beans = new HashMap<String, Object>();
			beans.put("stockItemVos", stockItemVos);
			XLSReadStatus readStatus = mainReader.read(bis, beans);
			// 商品種類 商品品牌的名詞比較
			List<CategoryDetails> cList = categoryDetailsMapper.all();
			List<BrandDetails> bList = brandDetailsMapper.all();
			for (StockItemVo stockItemVo : stockItemVos) {
				StockItem stockItem = new StockItem(stockItemVo);
				if (stockItemVo.getHazardFlagName().equals("否")) {
					stockItem.setHazardFlag(0);
				}else {
					stockItem.setHazardFlag(1);
				}
				for (CategoryDetails categoryDetails : cList) {
					if (stockItemVo.getCategoryName().equals(categoryDetails.getName())) {
						stockItem.setCategoryId(categoryDetails.getId());
						break;
					}
				}
				for (BrandDetails brandDetails : bList) {
					if (stockItemVo.getBrandName().equals(brandDetails.getName())) {
						stockItem.setBrandId(brandDetails.getId());
						break;
					}
				}
				this.stockitemMapper.add(stockItem);
			}		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void selectStockItem() {
		PageHelper.startPage(1, 10);
	    List<StockItem> list = stockitemMapper.selectStockItem();
	    //用PageInfo对结果进行包装
	    PageInfo<StockItem> page = new PageInfo<StockItem>(list);
	}
}
