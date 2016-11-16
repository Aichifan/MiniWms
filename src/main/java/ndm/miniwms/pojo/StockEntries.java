package ndm.miniwms.pojo;

import java.util.Date;

public class StockEntries {
	private Integer id;// 璁板綍id
	private Integer inventoryId;// 搴撳瓨id
	private Integer itemId;// 鍟嗗搧id
	private Date date;// 鏃ユ湡
	private String type;// 绫诲瀷
	private Integer inId;// 鍏ュ簱鍗昳d
	private Integer outId;// 鍑哄簱鍗昳d
	private Integer checkId;// 鐩樼偣id
	private Integer openingStock;// 鍙樻洿鍓嶆暟閲�
	private Integer closingStock;// 鍙樻洿鍚庢暟閲�
	private Integer companyId;// 鍏徃id
	private Integer operatorId;// 鎿嶄綔浜篿d

	private StockInventory stockInventory;//库存
	private StockItem stockItem;//商品
	private StockIn stockIn;//入库单
	private StockOut stockOut;//出库单
	private StockCheck stockCheck;//盘点
	private CompanyDetails companyDetails;//公司
	private CompanyUser companyUser;//用户
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Integer inventoryId) {
		this.inventoryId = inventoryId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getInId() {
		return inId;
	}

	public void setInId(Integer inId) {
		this.inId = inId;
	}

	public Integer getOutId() {
		return outId;
	}

	public void setOutId(Integer outId) {
		this.outId = outId;
	}

	public Integer getCheckId() {
		return checkId;
	}

	public void setCheckId(Integer checkId) {
		this.checkId = checkId;
	}

	public Integer getOpeningStock() {
		return openingStock;
	}

	public void setOpeningStock(Integer openingStock) {
		this.openingStock = openingStock;
	}

	public Integer getClosingStock() {
		return closingStock;
	}

	public void setClosingStock(Integer closingStock) {
		this.closingStock = closingStock;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(Integer operatorId) {
		this.operatorId = operatorId;
	}

}
