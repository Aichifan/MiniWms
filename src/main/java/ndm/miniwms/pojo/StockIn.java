package ndm.miniwms.pojo;

import java.util.Date;
import java.util.List;

public class StockIn {
	private Integer id; // 鍏ュ簱鍗昳d
	private Date created; // 鍒涘缓鏃堕棿
	private Date modified; // 淇敼鏃堕棿
	private Integer supplierId; // 渚涘簲鍟唅d
	private Date date; // 棰勮鍏ュ簱
	private String status; // 鐘舵��
	private Integer companyId; // 鍏徃id
	private Integer userId; // 鍒涘缓浜篿d
	private String billnumber; // 璁㈠崟缂栧彿
	private String description; // 澶囨敞
	private String customerBillnumber; // 瀹㈡埛璁㈠崟缂栧彿
	private SupplierDetails supplierDetails;//供应商
	private StockInventory stockInventory;//库存
	private	List<StockInEntries> stockInEntriesList;//入库单明细
	private CompanyDetails companyDetails;//公司
	private CompanyUser companyUser;//用户
	
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

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getBillnumber() {
		return billnumber;
	}

	public void setBillnumber(String billnumber) {
		this.billnumber = billnumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCustomerBillnumber() {
		return customerBillnumber;
	}

	public void setCustomerBillnumber(String customerBillnumber) {
		this.customerBillnumber = customerBillnumber;
	}

}
