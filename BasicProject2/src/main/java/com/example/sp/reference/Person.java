package com.example.sp.reference;

public class Person {
	private String name;
	private String education;
	private Address address;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String education, Address address) {
		super();
		this.name = name;
		this.education = education;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", education=" + education + ", address=" + address + "]";
	}
	
}
