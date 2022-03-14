package jpawithgradleinsert.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "employee_master")
@NamedQuery(name="Employee.findByName",query="select emp from Employee emp where emp.empName LIKE :empName")
public class Employee {
	@Id
	@Column(name = "emp_id")
	private Integer empId; // persistent field

	@Column(name = "emp_name")
	private String empName; // persistent field

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}



}


/*
 * <?xml version="1.0" encoding="UTF-8"?>
<persistence version="2.2" xmlns="http://xmlns.jcp.org/xml/ns/persistence" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence http://xmlns.jcp.org/xml/ns/persistence/persistence_2_2.xsd">
	<persistence-unit name="jpawithgradleinsert">
		<provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
		<class>jpawithgradleinsert.data.Employee</class>
		
	<properties>
		<property name="javax.persistence.jdbc.driver"
			value="com.mysql.jdbc.Driver" />
		<property name="javax.persistence.jdbc.url"
			value="jdbc:mysql://localhost:3306/test" />
		<property name="javax.persistence.jdbc.user" value="root" />
		<property name="javax.persistence.jdbc.password" value="Sreeparna@10" />
		<property
			name="javax.persistence.schema-generation.database.action"
			value="update" />
		<property name="hibernate.dialect"
			value="org.hibernate.dialect.MySQL8Dialect" />
		<property name="hibernate.show_sql" value="true" />
	</properties>
		
	</persistence-unit>
</persistence>
*/
 */

