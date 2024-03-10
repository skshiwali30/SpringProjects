package com.example.sp.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configAutoWireAnnotation.xml");
		Employee emp = context.getBean("emp1", Employee.class);
		System.out.println(emp);
		System.out.println("----------------------");
	}

}
