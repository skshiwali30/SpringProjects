package com.example.sp.reference;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configReference.xml");
		Person p = (Person) context.getBean("personRef");
		System.out.println(p);
		Address a = (Address) context.getBean("addressRef");
		System.out.println(a);
		Person p1 = (Person) context.getBean("personRef1");
		System.out.println(p1);
		Address a1 = (Address) context.getBean("addressRef1");
		System.out.println(a1);
		Person p2 = (Person) context.getBean("personRef2");
		System.out.println(p2);
		Address a2 = (Address) context.getBean("addressRef2");
		System.out.println(a2);
	}
}
