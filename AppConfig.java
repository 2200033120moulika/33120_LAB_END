package com.ppk.SpringAnnotationsDemo4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.ppk.SpringAnnotationsDemo4")
public class AppConfig {
	
	@Bean(name = "student")
	public Student getStudentBean() {
		return new Student();
	}
	
	@Bean
	public Laptop laptop() {
		return new Laptop();
	}

}
