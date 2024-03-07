package com.example.sp.ci;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configCI.xml");
		Person p = (Person) context.getBean("ciPerson");
		Person p1 = (Person) context.getBean("ciPerson1");
		System.out.println(p);
		System.out.println(p1);
		
		Addition a = (Addition) context.getBean("add");
		a.doSum();
	}
}
