package com.example.sp.javaconfig;

import com.example.sp.reference.Address;

public class StudentWithoutComponent {
	private Address address;
	
	public StudentWithoutComponent() {
		super();
	}

	public StudentWithoutComponent(Address address) {
		super();
		this.address = address;
	}

	public void display() {
		System.out.println("Hi My name is keshav");
	}
}
