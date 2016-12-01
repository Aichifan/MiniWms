package ndm.miniwms.serviceImpl;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

public interface IBatchImportServiceImpl {
	public void addBrand(MultipartFile brand);
	public void addCompany(MultipartFile company);
	public void addSupplier(MultipartFile supplier);
	public void addCategory(MultipartFile category);
	public void addConsignee(MultipartFile consignee);
	public void addUser(MultipartFile user);
	public void addLocation(MultipartFile location);
	public void addWarehouse(MultipartFile warehouse);
}
