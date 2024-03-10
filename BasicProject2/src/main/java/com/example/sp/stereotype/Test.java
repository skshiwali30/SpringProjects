package com.example.sp.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configStereotype.xml");
		Student st = context.getBean("stObject", Student.class);
		System.out.println(st);
		System.out.println(st.getSubject().getClass().getName());
	}

}
