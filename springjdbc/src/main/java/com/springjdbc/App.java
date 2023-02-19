package com.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( " my program started......!" );
        
        ApplicationContext con = new AnnotationConfigApplicationContext(JdbcConfig.class);
        
         StudentDao studentDao = con.getBean("studentDao",StudentDao.class);
      //  insert
//         Student student = new Student();
//         student.setId(661);
//         student.setName("mirwaise");
//         student.setCity("lahore");
//         
//         int result = studentDao.insert(student);
//    
//        System.out.println("Student added"+ result);
//         
         
         //update
//         Student student = new Student();
//         student.setId(661);
//         student.setName("kasi1");
//         student.setCity("karachi ");
//         
//         int result = studentDao.change(student);
//         System.out.println("data change "+result);
        
         //delete
//         int result =studentDao.delete(56);
//         System.out.println("deleted "+result);
         
//         Student student = studentDao.getStudent(222);
//         System.out.println(student);
    
         List<Student> students = studentDao.getAllStudent();
         for(Student s:students) {
        	 System.out.println("all student"+s);
         }
    }
}
