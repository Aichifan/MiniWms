package ndm.miniwms.serviceImpl;

import java.util.List;

import ndm.miniwms.pojo.SupplierDetails;

public interface ISupplierServiceImpl {

	public List<SupplierDetails> all();

	public void update(SupplierDetails supplier);

	public void add(SupplierDetails supplier);

	public void delete(Integer id);

	public void selectById(Integer id);

	public void selectTab();
}
