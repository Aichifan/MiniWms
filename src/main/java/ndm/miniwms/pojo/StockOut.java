package ndm.miniwms.pojo;

import java.util.Date;
import java.util.List;

public class StockOut {
	private Integer id; // 出库单id
	private Date created; // 创建时间
	private Date modified; // 修改时间
	private Integer consigneeId; // 收货人id
	private Date date; // 预计出库
	private String status; // 状态
	private Integer companyId; // 公司id
	private Integer userId; // 创建人id
	private String billnumber; // 订单编号
	private String description; // description
	private String customerBillnumber; // 客户订单编号

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
