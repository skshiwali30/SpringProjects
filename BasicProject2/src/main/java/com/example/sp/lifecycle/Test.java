package com.example.sp.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("configLC.xml");
		Watch w = (Watch) context.getBean("wTitan");
		System.out.println(w);
		
		// registring shutdown hook
		context.registerShutdownHook();
		System.out.println("---------------------------------------------------");
		ClothsInterfaceBean cib = (ClothsInterfaceBean) context.getBean("cl");
		System.out.println(cib);
		
		// Just comment other getBean and run for annotation, also comment registerShutdownHook
		TshirtAnnotation t = (TshirtAnnotation) context.getBean("ts");
		System.out.println(t);
	}
}
