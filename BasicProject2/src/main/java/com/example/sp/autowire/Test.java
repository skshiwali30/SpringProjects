package com.example.sp.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configAutoWire.xml");
		Employee emp = context.getBean("emp", Employee.class);
		Employee emp1 = context.getBean("emp1", Employee.class);
		Employee emp2 = context.getBean("emp2", Employee.class);
		System.out.println(emp);
		System.out.println("----------------------");
		System.out.println(emp1);
		System.out.println("----------------------");
		System.out.println(emp2);
	}

}
