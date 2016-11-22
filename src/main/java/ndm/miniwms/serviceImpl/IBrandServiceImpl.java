package ndm.miniwms.serviceImpl;

import java.util.List;

import ndm.miniwms.pojo.BrandDetails;

public interface IBrandServiceImpl {

	public List<BrandDetails> all();

	public void update(BrandDetails brand);

	public void add(BrandDetails brand);

	public void delete(Integer id);

	public void selectById(Integer id);

	public void selectTab();
}
