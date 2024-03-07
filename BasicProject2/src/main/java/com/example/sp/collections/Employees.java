package com.example.sp.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employees {
	private String empName;
	private List<String> skills;
	private Set<String> phones;
	private Map<String, Integer> courses;
	
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employees(String empName, List<String> skills, Set<String> phones, Map<String, Integer> courses) {
		super();
		this.empName = empName;
		this.skills = skills;
		this.phones = phones;
		this.courses = courses;
	}

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public Set<String> getPhones() {
		return phones;
	}
	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}
	public Map<String, Integer> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, Integer> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Employees [empName=" + empName + ", skills=" + skills + ", phones=" + phones + ", courses=" + courses
				+ "]";
	}
	
}
