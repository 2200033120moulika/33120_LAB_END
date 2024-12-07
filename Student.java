package com.ppk.SpringAnnotationsDemo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Student {
	
	private Laptop laptop;
	
	@Autowired
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}


	public void displayInfo()
	{
		System.out.println("Your code is ready.");
		laptop.compile();
	}

}
