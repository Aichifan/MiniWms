package ndm.miniwms.dao;

import java.util.List;

import ndm.miniwms.pojo.CompanyDetails;
import ndm.miniwms.pojo.LocationDetails;

public interface LocationDetailsMapper {
	List<LocationDetails> all();

	int delById(Integer id);

	int update(LocationDetails locationDetails);

	int add(LocationDetails locationDetails);
}
