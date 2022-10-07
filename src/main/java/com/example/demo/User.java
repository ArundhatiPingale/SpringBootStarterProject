package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {

	private String username;
	private String userid;
	
	@Autowired
	@Qualifier("lap")
	private Laptop laptop;
	public User() {
		// TODO Auto-generated constructor stub
		System.out.println("user object created");
	}

	
	


	public Laptop getLaptop() {
		return laptop;
	}
	
	public String getUserid() {
		return userid;
	}
	public String getUsername() {
		return username;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	 public void setUserid(String userid) {
		this.userid = userid;
	}
	 public void setUsername(String username) {
		this.username = username;
	}
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();

		return "user "+ username + " userid " +  userid + " laptop " + laptop;
	}
	 
	 public void output()
	 {
		 laptop.show();
		 System.out.println("inside user");
	 }


}
