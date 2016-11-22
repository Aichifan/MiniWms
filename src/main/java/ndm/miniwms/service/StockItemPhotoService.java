package ndm.miniwms.service;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;

import ndm.miniwms.pojo.StockItemPhoto;

public interface StockItemPhotoService {

	//查看圖片
	StockItemPhoto selectById(Integer id , HttpServletResponse response);
	
	// 添加圖片
	void add(StockItemPhoto stockItemPhoto , MultipartFile  image );
}
