package com.example.sp.basic;

public class Student {
	private String name;
	private String address;
	private int studentId;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, String address, int studentId) {
		super();
		this.name = name;
		this.address = address;
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", studentId=" + studentId + "]";
	}
}
