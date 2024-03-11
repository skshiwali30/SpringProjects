package com.example.sp.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configStereotype.xml");
		Student st = context.getBean("stObject", Student.class);
		System.out.println(st);
		System.out.println(st.getSubject().getClass().getName());
		
		System.out.println(st.hashCode());
		Student st1 = context.getBean("stObject", Student.class);
		System.out.println(st1.hashCode());
		
		Teacher t = (Teacher) context.getBean("teach");
		Teacher t1 = (Teacher) context.getBean("teach");
		System.out.println(t);
		System.out.println(t.hashCode());
		System.out.println(t1);
		System.out.println(t1.hashCode());
	}

}
