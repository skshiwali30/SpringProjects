package com.example.sp.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{10 > 1 ? 11 : 9}")
	private int x;
	
	@Value("#{20 + 1}")
	private int y;
	
	// static method
	@Value("#{T(java.lang.Math).sqrt(4)}")
	private int z;
	
	// static variable
	@Value("#{T(java.lang.Math).PI}")
	private double a;
	
	// object creation
	@Value("#{new String('Shiwali')}")
	private String name;
	
	// bydefault is false
	// return boolean
	@Value("#{8 > 3}")
	private boolean isActive;
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", a=" + a + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	
}
