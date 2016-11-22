package ndm.miniwms.serviceImpl;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public interface IBatchImportServiceImpl {
	public void addBrand(CommonsMultipartFile brand);
	public void addCompany(CommonsMultipartFile company);
	public void addSupplier(CommonsMultipartFile supplier);
	public void addCategory(CommonsMultipartFile category);
	public void addConsignee(CommonsMultipartFile consignee);
	public void addUser(CommonsMultipartFile user);
	public void addLocation(CommonsMultipartFile location);
	public void addWarehouse(CommonsMultipartFile warehouse);
}
