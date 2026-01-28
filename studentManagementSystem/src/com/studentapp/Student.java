package com.studentapp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
	

	private	String name;  // Non Premitivie = Null
	private int age; //zero
	private String studentId; // Non Premitivie = Null
	private List<String> courses; // Non Premitivie = Null
	public Student(String name, int age, String studentId) {
		super();
		if (vaildateAge(age) && validateName(name) && validateStudentId(studentId)) {
		this.name = name;
		this.age = age;
		this.studentId = studentId;
		courses = new ArrayList<String>(); // Intialization of courses !!!
	}
	}
	
	private boolean validateStudentId(String studentId) {
		// TODO Auto-generated method stub
		String studentIdRegex = "S-\\d+$";
		Pattern studentIdPattern = Pattern.compile(studentIdRegex);
		Matcher studentIdMatcher = studentIdPattern.matcher(studentId);
		if(studentIdMatcher.matches()) {
			return true;
		}
		else {
			System.err.println("Invalidate Student Id... Use the format Eg... S-1232");
		}
		return false;
	}

	public void enrollCouse(String course) {
		
		if (courses.contains(course)) {
			System.err.println("Student is already Enrolled to the course "  +course);
		} else {
		
		courses.add(course);
		System.out.println("Student is enrolled to "+ course +" successfully");
	}
	}
	
	public void printStudentInfo() {
		System.out.println("======== Student Information ========");
		System.out.println("Student Name:" + name);
		System.out.println("Student Age:" + age);
		System.out.println("Student Id:" + studentId);
		System.out.println("Enrolled For:" + courses);
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + ", courses=" + courses + "]";
	}
	
	
// validation method
	
	public boolean vaildateAge(int age) {
		if (age>=19 && age <=35) {
			return true;
		}
		else {
			System.err.println("Invalid age !!! Student Age needs to be between 19 and 35 ");
			return false;
			
		}
		
	}

	public boolean validateName(String name) {
		String nameRegex = "^[a-zA-Z\\s]+$";
		Pattern namePattern = Pattern.compile(nameRegex);
		Matcher nameMatcher = namePattern.matcher(name);
		if(nameMatcher.matches()) {
			return true;
			
		}
		else {
			System.err.println("Invlid name !!!! Please enter Alphabets only");
			return false;
		}
	}
	

}


