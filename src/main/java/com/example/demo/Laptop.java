package com.example.demo;

import org.springframework.stereotype.Component;

@Component(value="lap")
public class Laptop {
	private String brand;
	private String version;

	public Laptop() {
		// TODO Auto-generated constructor stub
		System.out.println("laptop object created");
		
	}
	 public String getBrand() {
		return brand;
	}
	 public String getVersion() {
		return version;
	}


	 public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setVersion(String version) {	
		this.version = version;
	}
	
	public void print()
	{
		System.out.println("Inside Laptop");
	}
	
	 @Override public String toString() { // TODO Auto-generated method stub
	 return "brand " + brand + " version " + version; }
	 

	public void show()
	{
		System.out.println("inside laptop");
	}
}
