package com.example.sp.reference;

public class Address {

	private String landmark;
	private String city;
	private String pinCode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String landmark, String city, String pinCode) {
		super();
		this.landmark = landmark;
		this.city = city;
		this.pinCode = pinCode;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [landmark=" + landmark + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	
}
