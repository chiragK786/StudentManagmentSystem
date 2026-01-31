package com.studentapp;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		System.out.println("*************** Student Management System ***************");
		System.out.println("************* Welcome *************");
		
		List <Student> studentList  = new ArrayList<Student>();
		
		Student s1; //reference variable  which stores the unique Identification or Hash code of the object created in Heap memory
		s1 = new Student("Ajay", 22, "S-1");  // variable inside the method are called as local variable and store in stack memory
		s1.enrollCouse("Java"); // course should be unique, same student cannot enrolled in the 
		
		s1.enrollCouse("DSA");
		s1.enrollCouse("DevOps");
//		s1.enrollCouse("C#");
//		s1.enrollCouse("JS");
		
		
		//  this is an object whenever an object is created three things are bound to help
		// class will be loaded in particular memory
		//Instance variable is created 
		//constructor will be called
//		System.out.println(s1);

		
		
		Student s2 = new Student("Ajit",24,"S-123");
		s2.enrollCouse("Java");

		
		Student s3 = new Student("Aj",34,"S-23");
		s3.enrollCouse("DSA");
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);

	}
	
	public void findStudentById(String )

}
