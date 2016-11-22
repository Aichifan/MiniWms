package ndm.miniwms.serviceImpl;

import java.util.List;

import ndm.miniwms.pojo.LocationDetails;

public interface ILocationServiceImpl {
	public List<LocationDetails> all();

	public void update(LocationDetails locationDetails);

	public void add(LocationDetails locationDetails);

	public void delete(Integer id);

	public void selectById(Integer id);

	public void selectTab();
}