package com.example.sp.ci;

import java.util.List;

import com.example.sp.reference.Address;

public class Person {
	private String name;
	private int id;
	private Address address;
	private List<String> skills;
	
	public Person(String name, int id, Address address, List<String> skills) {
		this.name = name;
		this.id = id;
		this.address = address;
		this.skills = skills;
	}

	@Override
	public String toString() {
		System.out.println("-----------------------------------");
		return this.name + "\n" + this.id + "\n" + this.address + "\n" + this.skills;
	}
	
}
