package com.example.sp.lifecycle;

public class Watch {
	private String company;
	private String modelNo;
	
	public Watch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Watch(String company, String modelNo) {
		super();
		this.company = company;
		this.modelNo = modelNo;
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		System.out.println("Setting company.");
		this.company = company;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	
	@Override
	public String toString() {
		return "Watch [company=" + company + ", modelNo=" + modelNo + "]";
	}
	
	// name can be change, just pass the name of method in xml as init-method="method name"
	public void init() {
		System.out.println("Inside init method..");
	}
	
	// name can be change, just pass the name of method in xml as destroy-method="method name"
	public void destroy() {
		System.out.println("Inside destroy method..");
	}
	
}
