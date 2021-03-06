package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Employee;
public class EmployeeDao {
	
	public List<Employee> getAllEmployeeDetails() {
		List<Employee> listOfEmp =new ArrayList<>();
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database", "root", "root@123");
	PreparedStatement pstmt = con.prepareStatement("select * from employee");
	ResultSet rs = pstmt.executeQuery();
	while(rs.next()) {
		Employee emp = new Employee();
		emp.setId(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setSalary(rs.getFloat(3));
		emp.setDesg(rs.getString(4));
		listOfEmp.add(emp);
	}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listOfEmp;
	}

}
