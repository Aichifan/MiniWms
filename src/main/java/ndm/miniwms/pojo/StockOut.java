package ndm.miniwms.pojo;

import java.util.Date;
import java.util.List;

public class StockOut {
	private Integer id; // 鍑哄簱鍗昳d
	private Date created; // 鍒涘缓鏃堕棿
	private Date modified; // 淇敼鏃堕棿
	private Integer consigneeId; // 鏀惰揣浜篿d
	private Date date; // 棰勮鍑哄簱
	private String status; // 鐘舵��
	private Integer companyId; // 鍏徃id
	private Integer userId; // 鍒涘缓浜篿d
	private String billnumber; // 璁㈠崟缂栧彿
	private String description; // description
	private String customerBillnumber; // 瀹㈡埛璁㈠崟缂栧彿
	
	private List<StockEntries> stockEntriesList;//库存变更记录
	private List<StockOutEntries> stockOutEntriesList;//出库单条目
	private ConsigneeDetails consigneeDetails;//收货人
	private CompanyDetails companyDetails;//公司
	private CompanyUser companyUser;//用户/创建人
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

	public Integer getConsigneeId() {
		return consigneeId;
	}

	public void setConsigneeId(Integer consigneeId) {
		this.consigneeId = consigneeId;
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
