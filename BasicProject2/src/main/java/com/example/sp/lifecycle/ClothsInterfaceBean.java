package com.example.sp.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ClothsInterfaceBean implements InitializingBean, DisposableBean {
	private String color;
	private String size;
	
	public ClothsInterfaceBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ClothsInterfaceBean(String color, String size) {
		super();
		this.color = color;
		this.size = size;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "ClothsInterfaceBean [color=" + color + ", size=" + size + "]";
	}

	// afterPropertiesSet will run after property initialization as name suggest.. i.e. init()
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside init i.e. afterPropertiesSet");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy ");
	}
	
}
