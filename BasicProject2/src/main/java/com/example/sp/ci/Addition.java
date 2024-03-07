package com.example.sp.ci;

public class Addition {
	private int num1;
	private int num2;
	
	public Addition(double num1, double num2) {
		this.num1 = (int) num1;
		this.num2 = (int) num2;
		System.out.println("Constructor double method..");
	}
	
	public Addition(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("Constructor int method..");
	}
	
	public void doSum() {
		System.out.println("Sum is : " + (this.num1 + this.num2)); 
	}

}
