package com.sp.orm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	@Column(name = "Full_Name")
	private String fname;
	
	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(name = "city")
	private String city;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String fname, int id, String batch) {
		super();
		this.fname = fname;
		this.id = id;
		this.city = batch;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBatch() {
		return city;
	}

	public void setBatch(String batch) {
		this.city = batch;
	}

	@Override
	public String toString() {
		return "Student [fname=" + fname + ", id=" + id + ", batch=" + city + "]";
	}
	
}
