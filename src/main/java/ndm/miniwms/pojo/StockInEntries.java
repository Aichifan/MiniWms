package ndm.miniwms.pojo;

public class StockInEntries {
	private Integer id; // 入库单明细id
	private Integer inId; // 入库单id
	private Integer itemId; // 商品id
	private Integer quantity; // 数量
	private Integer locationId; // 库位id
	private String UDF1; // 自定义参�?1
	private String UDF2; // 自定义参�?2
	private String UDF3; // 自定义参�?3
	private String UDF4; // 自定义参�?4
	private String UDF5; // 自定义参�?5
	private String UDF6; // 自定义参�?6

	private StockItem stockItem; //商品
	private LocationDetails locationDetails; //库位
	private StockIn stockIn; //入库单
	
	public StockItem getStockItem() {
		return stockItem;
	}

	public void setStockItem(StockItem stockItem) {
		this.stockItem = stockItem;
	}

	public LocationDetails getLocationDetails() {
		return locationDetails;
	}

	public void setLocationDetails(LocationDetails locationDetails) {
		this.locationDetails = locationDetails;
	}

	public StockIn getStockIn() {
		return stockIn;
	}

	public void setStockIn(StockIn stockIn) {
		this.stockIn = stockIn;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getInId() {
		return inId;
	}

	public void setInId(Integer inId) {
		this.inId = inId;
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

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
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
