package com.example.sp.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configStandaloneCollection.xml");
		Person p = context.getBean("frnd", Person.class);
		System.out.println(p);
		System.out.println(p.getFriends().getClass().getName());
	}
}
