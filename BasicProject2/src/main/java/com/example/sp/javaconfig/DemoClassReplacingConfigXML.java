package com.example.sp.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.sp.reference.Address;

// @Configuration annotation tells that this is main configuration class which holds info like config.xml
@Configuration
@ComponentScan(basePackages = "com.example.sp.javaconfig")
public class DemoClassReplacingConfigXML {

	@Bean
	public Address getAddress() {
		Address ad = new Address();
		return ad;
	}
	
	@Bean
	public StudentWithoutComponent getStudent() {
		StudentWithoutComponent swc = new StudentWithoutComponent(getAddress());
		return swc;
	}
}
