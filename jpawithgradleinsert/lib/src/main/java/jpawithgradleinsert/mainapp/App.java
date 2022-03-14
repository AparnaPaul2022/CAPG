package jpawithgradleinsert.mainapp;

import jpawithgradleinsert.data.Employee;
import jpawithgradleinsert.service.EmployeeService;
import jpawithgradleinsert.service.EmployeeServiceImpl;



public class App {

	public static void main(String[] args) {
		
		EmployeeService employeeService=new EmployeeServiceImpl();
		//Employee employee = new Employee();
		
		/*employee.setId(1);
		employee.setName("Aparna Paul");
		
		employee.setId(2);
		employee.setName("Suparna Paul");
		employee.setAddress("Pune");
		employee.setSalary(35000);
		
		
		employee.setId(3);
		employee.setName("Anuja Triwedi");
		employee.setAddress("Mumbai");
		employee.setSalary(40000);
		
		
		employee.setId(1);
		employee.setName("KL Rahul");
		employee.setAddress("Bangalore");
		employee.setSalary(45000);
		
		employeeService.addEmployee(employee);
		*/
		
		
		
		//Employee employee = employeeService.getEmployee(7);
		//System.out.println(employee);
		
			
			//Employee employee = employeeService.getEmployee(7);
			//System.out.println(employee);
			
			Employee emp = new Employee();
			//emp.setEmpId(5);
			//emp.setEmpName("Borris Johnson");
			//emp.setEmpId(15);
			//emp.setEmpName("Narendra Modi");
			//At this point of execution emp entity is in new state or transient state
			//employeeService.addEmployee(emp);
			//Delete an entity instance
			//employeeService.deleteEmployee(emp);
			
			System.out.println(employeeService.getAllEmployee());
			//System.out.println(employeeService.getEmployeeByName("Aparna Paul"));

		}
	}
	


