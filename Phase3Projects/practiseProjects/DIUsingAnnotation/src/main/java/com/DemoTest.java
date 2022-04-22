package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
				Employee emp = (Employee)ac.getBean("employee");
				System.out.println(emp);
	}

}
