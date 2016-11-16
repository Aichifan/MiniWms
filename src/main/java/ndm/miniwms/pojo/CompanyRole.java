package ndm.miniwms.pojo;

import java.util.Date;

public class CompanyRole {
	private Integer id; // 角色id
	private Date created; // 创建时间
	private Date modified; // 修改时间
	private String name; // 名称
	private Integer companyId; // 公司id
	private CompanyDetails companyDetails;//公司对象

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

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

}
