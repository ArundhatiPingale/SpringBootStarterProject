package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringFirstProjectApplication2 {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SpringFirstProjectApplication2.class, args);

	User user= context.getBean(User.class);
	  user.setUsername("abc");
	  user.setUserid("132");
	  Laptop laptop= context.getBean(Laptop.class);
	  laptop.setBrand("iph");
	  laptop.setVersion("latest");
	  user.setLaptop(laptop);

		System.out.println( user.toString() + " laptop  " + user.getLaptop());
		user.output();
		System.out.println("Shivraj");

	}

}
