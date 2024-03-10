package com.example.sp.autowire;

import com.example.sp.reference.Address;

public class Employee {
	private String name;
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
	public void setAddress(Address address) {
		System.out.println("Inside Setter");
		this.address = address;
	}

	public Employee() {
		super();
	}

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
