package com.studentapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {
	
	private static List <Student> studentList;

	public static void main(String[] args) {
		System.out.println("*************** Student Management System ***************");
		System.out.println("************* Welcome *************");
		
		studentList  = new ArrayList<Student>();
		
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

		
		Student s3 = new Student("Bishan",34,"S-23");
		s3.enrollCouse("DSA");
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		Student result = findStudentById("S-23");
		System.out.println("Result " + result);
		sortByName();

	}
	
	private static void sortByName() {
		// TODO Auto-generated method stub
		Comparator<Student>  studentNameComparator = (o1,o2) -> o1.getName().compareTo(o2.getName());

				/*	@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());  // this comparison done by Lexographically
			}
			
		};
		*/
		Collections.sort(studentList,studentNameComparator);
		System.out.println(studentList);
	}

	public static Student findStudentById(String studentId ) {
	Student result = null;	
	
	try {
		result =	studentList.stream().filter(x -> x.getStudentId().equalsIgnoreCase(studentId)).findFirst().orElseThrow(()-> new RuntimeException("No Data Found !!!!"));
	}
	catch(RuntimeException e) {
		System.err.println("Student with ID " + studentId+ " not found !!");
	}
	return result;
	
	}

}
