package com.example.sp.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// if use only @Component then it will search with object student
@Component("stObject")
@Scope("prototype")
public class Student {
	@Value("Kiaansh Kumar")
	private String name;
	
	@Value("Texas")
	private String city;
	
	@Value("#{sub}")
	private List<String> subject;
	
	public List<String> getSubject() {
		return subject;
	}
	public void setSubject(List<String> subject) {
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", subject=" + subject + "]";
	}
	
}
