package ndm.miniwms.pojo;

import java.util.Date;

public class StockInventory {
	private Integer id; // 搴撳瓨id
	private Date created; // 鍒涘缓鏃堕棿
	private Date modified; // 淇敼鏃堕棿
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

	private StockIn stockIn;//入库单
	private StockItem stockItem;//商品
	private LocationDetails locationDetails;//库位
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
