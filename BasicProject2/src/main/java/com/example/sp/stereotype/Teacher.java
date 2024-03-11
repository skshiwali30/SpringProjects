package com.example.sp.stereotype;

public class Teacher {
	private String tName;
	private String sub;
	
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	
	@Override
	public String toString() {
		return "Teacher [tName=" + tName + ", sub=" + sub + "]";
	}
	
}
