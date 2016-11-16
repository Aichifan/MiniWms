package ndm.miniwms.pojo;

public class StockCheckEntries {
	private Integer id;// 鏄庣粏id
	private Integer checkId;// 鐩樼偣id
	private Integer inventoryId;// 搴撳瓨id
	private Integer quantity;// 鍘熸暟閲�
	private Integer checkQuantity;// 鐩樼偣鏁伴噺

	private StockCheck stockCheck;//盘点
	private StockInventory stockInventory;//库存
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCheckId() {
		return checkId;
	}

	public void setCheckId(Integer checkId) {
		this.checkId = checkId;
	}

	public Integer getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Integer inventoryId) {
		this.inventoryId = inventoryId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getCheckQuantity() {
		return checkQuantity;
	}

	public void setCheckQuantity(Integer checkQuantity) {
		this.checkQuantity = checkQuantity;
	}

}
