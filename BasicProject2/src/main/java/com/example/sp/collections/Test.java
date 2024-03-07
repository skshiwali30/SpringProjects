package com.example.sp.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configCollection.xml");
		Employees emp = (Employees) context.getBean("empColl");
		System.out.println("Employees : " + emp);
	}

}
