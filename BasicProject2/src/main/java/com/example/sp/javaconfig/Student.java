package com.example.sp.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private String name;
	private int id;
	private long marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getMarks() {
		return marks;
	}
	public void setMarks(long marks) {
		this.marks = marks;
	}
	
	public void action() {
		System.out.println("Student is reading/writing..");
	}
}
