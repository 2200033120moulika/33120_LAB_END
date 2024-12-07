package com.ppk.SpringAnnotationsDemo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(context);
        
//        Student student1 = context.getBean(Student.class);
//        Student student1 = context.getBean("stuBean",Student.class);
        Student student1 = context.getBean("student",Student.class);
//        Student student1 = context.getBean("getStudentBean",Student.class);
//       student1.displayInfo();
        
//        Laptop laptop = context.getBean("lapiBean",Laptop.class);
//        laptop.compile();
        
        student1.displayInfo();
    }
}
