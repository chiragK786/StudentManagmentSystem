Student Management System

Java Console Application

📌 Project Overview

The Student Management System is a Java-based console application designed to demonstrate a solid understanding of Core Java fundamentals, Object-Oriented Programming (OOP) principles, collections, and exception handling.

This project focuses on building clean, modular, and maintainable code while strengthening logical problem-solving skills. It serves as the first phase of a larger Java and Selenium assignment, where the next phase will involve building an automation testing framework.


🛠️ Technologies Used

Java (JDK 8+)

Java Collections Framework

Exception Handling

Console-based I/O

📂 Project Structure
StudentManagementSystem
│
├── Main.java
├── Student.java
└── README.md

🧩 Key Features

Student entity with attributes:

Name

Age

Student ID

Enrolled Courses

Course enrollment functionality

Display student details in readable format

Search student by Student ID

Custom exception handling when student is not found

Clean and modular code structure

📘 Class Details
1. Student Class

Responsible for:

Storing student details

Enrolling courses

Printing student information

Attributes:

String name

int age

String studentId

List<String> courses

Methods:

enrollCourse(String course)

printStudentInfo()

2. Main Class

Responsible for:

Creating student objects

Managing list of students

Searching student by ID

Handling exceptions

Key Method:

findStudentById(String studentId)

Throws exception if student is not found.

▶️ How to Run the Application

Clone the repository:

git clone <your-repo-link>


Navigate to the project folder:

cd StudentManagementSystem


Compile the Java files:

javac Main.java Student.java


Run the application:

java Main

🧪 Sample Output
Student Name: Rahul
Age: 21
Student ID: STU101
Courses Enrolled: Java, Selenium, SQL


If student ID not found:

Student with ID STU999 not found.

🎯 Learning Outcomes

Better understanding of Core Java fundamentals

Hands-on practice with OOP concepts

Practical use of Lists and custom exceptions

Improved logical thinking for real-world problems


👤 Author

Chirag Khanduja
Aspiring QA / SDET
