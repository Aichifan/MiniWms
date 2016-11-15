package ndm.miniwms.pojo;

import java.util.Date;

public class CompanyDetails {
	private Integer id; // 公司id
	private Date created; // 创建时间
	private Date modified; // 修改时间
	private String name; // 名称
	private String anothername; // 别名
	private String address; // 地址
	private String email; // 邮箱
	private String description; // 描述
	private Integer issystem; // 是否是主公司
	private String contactName; // 联系人名称
	private String contactTel; // 联系人号码
	private String contactFax; // 联系人传真
	private String contactEmail; // 联系人邮箱
	private String contactQq; // 联系人QQ
	private String contactMsn; // 联系人Skype
	private String contactDesc; // 联系人描述
	private String skuPrev; // SKU前缀

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAnothername() {
		return anothername;
	}

	public void setAnothername(String anothername) {
		this.anothername = anothername;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getIssystem() {
		return issystem;
	}

	public void setIssystem(Integer issystem) {
		this.issystem = issystem;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactTel() {
		return contactTel;
	}

	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}

	public String getContactFax() {
		return contactFax;
	}

	public void setContactFax(String contactFax) {
		this.contactFax = contactFax;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactQq() {
		return contactQq;
	}

	public void setContactQq(String contactQq) {
		this.contactQq = contactQq;
	}

	public String getContactMsn() {
		return contactMsn;
	}

	public void setContactMsn(String contactMsn) {
		this.contactMsn = contactMsn;
	}

	public String getContactDesc() {
		return contactDesc;
	}

	public void setContactDesc(String contactDesc) {
		this.contactDesc = contactDesc;
	}

	public String getSkuPrev() {
		return skuPrev;
	}

	public void setSkuPrev(String skuPrev) {
		this.skuPrev = skuPrev;
	}

}
