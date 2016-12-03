package ndm.miniwms.serviceImpl;

import java.util.List;

import ndm.miniwms.pojo.BrandDetails;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

public interface IBrandServiceImpl {

	public List<BrandDetails> all();

	public void update(BrandDetails brand);

	public void add(BrandDetails brand);

	public void delete(Integer id);

	public void selectById(Integer id);

	public Pagination<BrandDetails> selectTab(TableModel model);
}
