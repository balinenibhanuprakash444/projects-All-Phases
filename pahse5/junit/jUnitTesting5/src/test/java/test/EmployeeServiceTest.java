package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.bean.Employee;
import com.service.EmployeeService;

class EmployeeServiceTest {

	@Test
	@Disabled
	void testSayHello() {
		EmployeeService es = new EmployeeService();
		String result = es.sayHello("Ravi");
		assertEquals("Welcome to JUnit 5 testing Ravi", result);
	}
	
	@Test
	@Disabled
	public void testCheckUser() {
		EmployeeService es = new EmployeeService();
		String result = es.checkUser("Ravi", "123");
		assertEquals("failure", result);
	}
	
	@Test
	@Disabled
	public void testUpdateSalary() {
		EmployeeService es = new EmployeeService();
		Employee emp1= new Employee(1, "Ravi", 45000, "Manager");
		float updatedSalary	 = es.updateSalary(emp1);
		assertEquals(50000, updatedSalary);
	}
	
	@Test
	@Disabled
	public void testGetEmployeeInfo() {
		EmployeeService es = new EmployeeService();
		Employee emp = es.getEmployeeInfo();
		assertNotNull(emp);
		assertEquals(15000, emp.getSalary());
	}
	
	@Test 
	@Disabled
	public void testGetEmloyeeDetails() {
		EmployeeService es = new EmployeeService();
		List<Employee> listOfEmployees= es.getEmloyeeDetails();
		Employee emp1 = listOfEmployees.get(0);
		assertEquals(listOfEmployees.size(), 3);
		assertEquals(100, emp1.getId());
		assertEquals("Mahesh", emp1.getName());
		assertEquals(18000, emp1.getSalary());
		assertEquals("Programmer", emp1.getDesg());
	}
	@Test
	@DisplayName(value = "Employee Details testing from Db")
	public void testGetEmployeeDataFromDb() {
		EmployeeService es = new EmployeeService();
		List<Employee> listOfemp = es.getEmloyeeDetails();
		assertEquals(listOfemp.size(),15);
	}
}