package com.example.sp.lifecycle;

import javax.annotation.*;

public class TshirtAnnotation {
	private String size;
	private int quantity;
	
	public TshirtAnnotation() {
		super();
	}

	public TshirtAnnotation(String size, int quantity) {
		super();
		this.size = size;
		this.quantity = quantity;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "TshirtAnnotation [size=" + size + ", quantity=" + quantity + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Inside start method...");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Inside end method/..");
	}
	
}
