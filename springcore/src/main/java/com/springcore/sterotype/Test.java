package com.springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/sterotype/stereotypeconfig.xml");
		
		Student student =(Student)	con.getBean("s1");
//		
//		System.out.println(student);
//		System.out.println(student.getAddress());
//		System.out.println(student.getAddress().getClass());
		
		System.out.println(student.hashCode());
		
	Student student1 =(Student)con.getBean("s1");
	System.out.println(student1.hashCode());
	
Teacher teacher	=(Teacher) con.getBean("teacher");
Teacher teacher1	=(Teacher) con.getBean("teacher");

System.out.println(teacher.hashCode());
System.out.println(teacher1.hashCode());
	}

}
