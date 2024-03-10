package com.example.sp.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.sp.reference.Address;

public class Employee {
	private String name;
	
	@Autowired
	@Qualifier("address2")
	private Address address;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAddress() {
		return address;
	}
	
	//@Autowired
	public void setAddress(Address address) {
		System.out.println("Inside Setter");
		this.address = address;
	}

	public Employee() {
		super();
	}

	//@Autowired
	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
		System.out.println("Inside constructor");
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}
	
}
