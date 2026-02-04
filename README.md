# Student Management System (Java Homework)

A simple Java console application implementing the Student Management System homework assignment. This project demonstrates core Java concepts: classes, collections, exception handling, and optional features like sorting and console input.

Repository: [chiragK786/StudentManagmentSystem](https://github.com/chiragK786/StudentManagmentSystem)

> Note: The repository name uses "Managment" (typo). The project title in this README uses the corrected spelling "Management".

## Assignment Objective

Build a Java console app to practice OOP, collections, and exception handling:
- Implement a `Student` class with attributes and methods for enrolling in courses and printing info.
- Create `Main` to instantiate students, manage a list of students, search by student ID (throwing and handling an exception when not found).
- (Optional) Sort students by name and accept user input to add students and enroll them in courses.

## What this repo implements

This repository implements the required features from the assignment:

Part 1 — Basic Java Concepts
- `Student` class with:
  - Attributes: `String name`, `int age`, `String studentId`, `List<String> courses`
  - Constructor to initialize `name`, `age`, `studentId`
  - `void enrollCourse(String course)` to add a course
  - `void printStudentInfo()` to display student details and courses
- `Main` class:
  - Instantiates three students with different details
  - Enrolls each student in 2–3 courses
  - Prints each student's info using `printStudentInfo()`

Part 2 — Collections and Exception Handling
- `List<Student>` to store students
- `Student findStudentById(String studentId)` that searches the list and throws a custom exception if not found
- Exception handling in `Main` that catches the exception and prints:
  "Student with ID [ID] not found."

Part 3 — Optional (if implemented)
- Sorting students by `name` using `Collections.sort()` and a custom `Comparator`
- Console input to add new students and enroll them in courses (interactive mode)

(If any of the optional features are not present in the repo, they can be added — tell me and I’ll update the README.)

## Prerequisites

- Java JDK 11 or newer
- Git
- (Optional) Maven or Gradle if the repo uses a build tool

## Build & Run

There are two common scenarios — a simple command-line compile/run, or using a build tool.

A) Plain javac/java (no build tool)
1. From the repository root, locate the `src` (or top-level `.java`) files. Example commands when sources are in `src/` and package-less or simple packages:
```bash
# compile
javac -d out $(find src -name "*.java")
# run (adjust package path if Main is in a package)
java -cp out Main
```

B) With Maven
```bash
mvn clean package
# run (update main class and artifact name as needed)
java -jar target/<artifact-name>.jar
```

C) With Gradle (wrapper)
```bash
./gradlew clean build
java -jar build/libs/<artifact-name>.jar
```

If your project is organized with packages (e.g., `com.example.student`), run the `Main` class by its fully qualified name:
```bash
java -cp out com.example.student.Main
```

If you share the repository structure or your build file (pom.xml / build.gradle), I will add exact commands.

## Example Usage & Output

When run, the `Main` class does the following (example console output):

- Creates three students and enrolls them:
```
Student: Alice Johnson
Age: 20
ID: S1001
Courses:
 - Mathematics
 - Physics

Student: Bob Smith
Age: 21
ID: S1002
Courses:
 - English
 - History
 - Art

Student: Carol Lee
Age: 19
ID: S1003
Courses:
 - Chemistry
 - Biology
```

- Searching for a student by ID:
```
Enter student ID to search: S9999
Student with ID S9999 not found.
```

- If sorting is implemented, you may see a sorted list by name:
```
Students sorted by name:
Alice Johnson
Bob Smith
Carol Lee
```

- If interactive console input was implemented, you can add a student and enroll them through prompts.

## Code Structure (typical)

Adjust this section to match the actual layout in your repo. Example:

- src/
    - Main.java
    - Student.java
    - Main2.java
   
- README.md


## Exception Details

- Method: `Student findStudentById(String studentId)`
  - Behavior: returns matching `Student` or throws a custom exception (e.g., `StudentNotFoundException`) with message: "Student with ID [ID] not found."
- `Main` catches this exception and prints the message to the console.


## Contributing

Contributions welcome:
1. Fork the repo
2. Create a feature branch
3. Commit with clear messages
4. Open a pull request describing the change

Please include unit tests for new features or bug fixes.

## License

No license specified in the repository. If you want a permissive license, consider MIT:
```
MIT License
...
```
Tell me which license you prefer and I will add a LICENSE file.

## Contact

Maintainer: chiragK786  
GitHub: https://github.com/chiragK786
