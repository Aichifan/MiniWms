package ndm.miniwms.pojo;

import java.util.Date;
import java.util.List;

public class StockInventory {
	private Integer id; // 搴撳瓨id
	private Date created; // 鍒涘缓鏃堕棿
	private Date modified; // 淇敼鏃堕棿
	private boolean locked; //鏄惁閿佸畾
	private Integer itemId; // 鍟嗗搧id
	private Integer quantity; // 鏁伴噺
	private Integer lastOperatorId; // 鏈�鍚庝慨鏀逛汉id
	private Integer companyId; // 鍏徃id
	private Integer locationId; // 搴撲綅id
	private Integer inId; // 鍏ュ簱鍗昳d
	private String UDF1; // 鑷畾涔夊弬鏁�1
	private String UDF2; // 鑷畾涔夊弬鏁�2
	private String UDF3; // 鑷畾涔夊弬鏁�3
	private String UDF4; // 鑷畾涔夊弬鏁�4
	private String UDF5; // 鑷畾涔夊弬鏁�5
	private String UDF6; // 鑷畾涔夊弬鏁�6

	private CompanyDetails companyDetails;//鍏徃
	private LocationDetails location;
	private StockItem stockItem;
	private StockIn stockIn;
	private List<LocationDetails> locationDetailsList;//搴撲綅
	private List<StockIn> stockInList;//鍏ュ簱鍗�
	private StockOutEntries stockOutEntries;//鍑哄簱鍗曟槑缁�
	private List<StockCheckEntries> stockCheckEntiesList;//鐩樼偣鏄庣粏
	private List<StockEntries> stockEntriesList;//鍙樻洿璁板綍
	private List<CompanyUser> companyUserList; //淇敼浜�
	
	
	public LocationDetails getLocation() {
		return location;
	}

	public void setLocation(LocationDetails location) {
		this.location = location;
	}

	public StockItem getStockItem() {
		return stockItem;
	}

	public void setStockItem(StockItem stockItem) {
		this.stockItem = stockItem;
	}

	public StockIn getStockIn() {
		return stockIn;
	}

	public void setStockIn(StockIn stockIn) {
		this.stockIn = stockIn;
	}

	public CompanyDetails getCompanyDetails() {
		return companyDetails;
	}

	public void setCompanyDetails(CompanyDetails companyDetails) {
		this.companyDetails = companyDetails;
	}

	public List<LocationDetails> getLocationDetailsList() {
		return locationDetailsList;
	}

	public void setLocationDetailsList(List<LocationDetails> locationDetailsList) {
		this.locationDetailsList = locationDetailsList;
	}

	public List<StockIn> getStockInList() {
		return stockInList;
	}

	public void setStockInList(List<StockIn> stockInList) {
		this.stockInList = stockInList;
	}

	public StockOutEntries getStockOutEntries() {
		return stockOutEntries;
	}

	public void setStockOutEntries(StockOutEntries stockOutEntries) {
		this.stockOutEntries = stockOutEntries;
	}

	public boolean isLocked() {
		return locked;
	}
	
	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public List<StockCheckEntries> getStockCheckEntiesList() {
		return stockCheckEntiesList;
	}

	public void setStockCheckEntiesList(List<StockCheckEntries> stockCheckEntiesList) {
		this.stockCheckEntiesList = stockCheckEntiesList;
	}

	public List<StockEntries> getStockEntriesList() {
		return stockEntriesList;
	}

	public void setStockEntriesList(List<StockEntries> stockEntriesList) {
		this.stockEntriesList = stockEntriesList;
	}

	public List<CompanyUser> getCompanyUserList() {
		return companyUserList;
	}

	public void setCompanyUserList(List<CompanyUser> companyUserList) {
		this.companyUserList = companyUserList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getLastOperatorId() {
		return lastOperatorId;
	}

	public void setLastOperatorId(Integer lastOperatorId) {
		this.lastOperatorId = lastOperatorId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public Integer getInId() {
		return inId;
	}

	public void setInId(Integer inId) {
		this.inId = inId;
	}

	public String getUDF1() {
		return UDF1;
	}

	public void setUDF1(String uDF1) {
		UDF1 = uDF1;
	}

	public String getUDF2() {
		return UDF2;
	}

	public void setUDF2(String uDF2) {
		UDF2 = uDF2;
	}

	public String getUDF3() {
		return UDF3;
	}

	public void setUDF3(String uDF3) {
		UDF3 = uDF3;
	}

	public String getUDF4() {
		return UDF4;
	}

	public void setUDF4(String uDF4) {
		UDF4 = uDF4;
	}

	public String getUDF5() {
		return UDF5;
	}

	public void setUDF5(String uDF5) {
		UDF5 = uDF5;
	}

	public String getUDF6() {
		return UDF6;
	}

	public void setUDF6(String uDF6) {
		UDF6 = uDF6;
	}

}
