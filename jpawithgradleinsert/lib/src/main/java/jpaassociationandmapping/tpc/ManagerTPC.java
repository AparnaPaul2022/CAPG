package jpaassociationandmapping.tpc;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "manager_tpc")
public class ManagerTPC extends EmployeeTPC{

	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}