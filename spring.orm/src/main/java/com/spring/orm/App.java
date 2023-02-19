package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
       
      StudentDao studentDao  = context.getBean("StudentDao",StudentDao.class);
//      Student student = new Student(222,"adnan","karachi");
//      int r = studentDao.insert(student);
//      System.out.println("done "+r);
    
      BufferedReader ar = new BufferedReader(new InputStreamReader(System.in));
      
      boolean go = true;
      while(go) {
    	  System.out.println("Welcome to springorm project ");
	      System.out.println("PRESS 1 for add new stduent");
	      System.out.println("PRESS 2 for display all stduent");
	      System.out.println("PRESS 3 get detail of single stduent");
	      System.out.println("PRESS 4 for delete stduents");
	      System.out.println("PRESS 5 for update stduents");
	      System.out.println("PRESS 6 for exit");
	      
	      try {
			
	    	  int input = Integer.parseInt(ar.readLine());
//	    	  if(input ==1) {
//	    		  
//	    	  }elseif(){
//	    		  
//	    	  }
	    	  
	    	  switch (input) {
			case 1:
				//add a new student.
				//taking inputs from user
				System.out.println("Enter user id: ");
				int uId=Integer.parseInt(ar.readLine());
				
				System.out.println("Enter your usename: ");
				String uName=ar.readLine();
				
				System.out.println("Enter user City: ");
				String uCity=ar.readLine();
				//creating student o and setting values
				Student s = new Student();
				s.setStudentId(uId);
				s.setStudentName(uName);
				s.setStudentCity(uCity);
				//saving student da
				int r = studentDao.insert(s);
				System.out.println(r+" Student added");
				System.out.println("********************");
				System.out.println( );
				break;
			case 2:
				//display all student
				System.out.println("*******************************");
				List<Student> allStudent = studentDao.getAllStudent();
				for(Student st:allStudent) {
					System.out.println("Id : "+ st.getStudentId());
					System.out.println("Name : "+ st.getStudentName());
					System.out.println("City : "+ st.getStudentCity());
					System.out.println("___________________________");
				}
				System.out.println("*******************************");

				break;
			
	      case 3:
				//get single student 
	    	  System.out.println("Enter user id: ");
				int userId=Integer.parseInt(ar.readLine());
	    	  	Student st1 = studentDao.getStudent(userId);
	    	  	System.out.println("Id : "+ st1.getStudentId());
				System.out.println("Name : "+ st1.getStudentName());
				System.out.println("City : "+ st1.getStudentCity());
				System.out.println("___________________________");
				break;
				
	      case 4:
				//delete student 
	    	  	System.out.println("Enter user id: ");
				int userIdDelete=Integer.parseInt(ar.readLine());
				studentDao.deleteStudent(userIdDelete);
				System.out.println("Student deleted");
				break;
	    	 
	      case 5:
				//update student 
	    	  System.out.println("UPDATE");
				
				System.out.println("Enter ID");
				int Id1 = Integer.parseInt(ar.readLine());
				
				System.out.println("Do you want to update name also type 1/2");
				int key=Integer.parseInt(ar.readLine());
				
				String Name1="";
				String City1 ="";
				
				
				Student std1 = studentDao.getStudent(Id1);
				System.out.println(std1);
				break;
				
				
	      case 6:
				//exit
	    	  	go=false;
				break;
				
	    	  }
				
	    	  
		} catch (Exception e) {
			System.out.println("invalid input try with another one ");
		}
	      System.out.println("thankyou for using my application");
	      System.out.println("see you soon");
	      
	      
   }
      
    }
}
