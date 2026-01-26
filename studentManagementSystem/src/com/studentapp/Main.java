package com.studentapp;

public class Main {

	public static void main(String[] args) {
		System.out.println("*************** Student Management System ***************");
		System.out.println("************* Welcome *************");
		
		Student s1; //reference variable  which stores the unique Identification or Hash code of the object created in Heap memory
		s1 = new Student("Ajay", 22, "S-1");  // variable inside the method are called as local variable and store in stack memory
		s1.enrollCouse("Java");
		
		s1.enrollCouse("Java");
		s1.enrollCouse("Java");
		s1.enrollCouse("Java");
		s1.enrollCouse("Java");
		
		//  this is an object whenever an object is created three things are bound to help
		// class will be loaded in particular memory
		//Instance variable is created 
		//constructor will be called
		System.out.println(s1);

	}

}
