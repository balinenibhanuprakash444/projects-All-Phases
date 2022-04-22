package com.main;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.bean.Employee;
import com.service.EmployeeService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		EmployeeService ed =new EmployeeService();
		int id;
		String name;
		float salary;
		String con= " ";
		int choice;
		do {
			System.out.println("1:Add,2:Delete,3:Update,4:Display All");
			System.out.println("plz enter your choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:System.out.println("Enter the id");
			       id = sc.nextInt();
			       System.out.println("Enter the name");
			       name = sc.next();
			       System.out.println("Enter the salary");
			       salary = sc.nextFloat();
			       Employee emp = new Employee(id,name,salary);
		           name = ed.storeEmployee(emp);
			       System.out.println(name);
		           break;
			case 2:System.out.println("Enter the id");
			       id = sc.nextInt();
			       name = ed.deleteEmployeeInfo(id);
			       System.out.println(name);
			   	   break;
			case 3:System.out.println("Enter the id");
			       id = sc.nextInt();
			       System.out.println("Enter the name");
			       name = sc.next();
			       System.out.println("Enter the salary");
			       salary = sc.nextFloat();
			       Employee emp1 = new Employee();
			       emp1.setId(id);
			       emp1.setSalary(salary);
			       name = ed.storeEmployee(emp1);
			       System.out.println(name);
			       break;
			case 4:List<Employee> listOfEmp = ed.getAllEmployee();
			       Iterator<Employee> li = listOfEmp.iterator();
			       while(li.hasNext()) {
			    	   Employee e = li.next();
			    	   System.out.println(e);
			       }
			       break;
			default:System.out.println("Wrong choice"); 
				  break;
			}
			System.out.println("do you want to continue?");
			con = sc.next();
		}while(con.equals("y"));
		System.out.println("Thank you visit again!");
		}
		
		
		
		
		
		
		
		
		

}
