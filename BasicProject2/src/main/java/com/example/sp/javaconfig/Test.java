package com.example.sp.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(DemoClassReplacingConfigXML.class);
		Student st = context.getBean("student", Student.class);
		//System.out.println(st.hashCode());
		st.action();
		
		StudentWithoutComponent sw = context.getBean("getStudent", StudentWithoutComponent.class);
		sw.display();
	}

}
