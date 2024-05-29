package com.Application;

import java.util.List;
import java.util.Scanner;

import com.models.Student;
import com.student.dao.StudentManagementDao;

public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("1. Add Student");
			System.out.println("2. View Students");
			System.out.println("3. Delete Student");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter student name: ");
				String name = scanner.next();
				System.out.print("Enter student age: ");
				int age = scanner.nextInt();
				Student newStudent = new Student();
				newStudent.setName(name);
				newStudent.setAge(age);
				StudentManagementDao.addingStudent(newStudent);
				break;
			case 2:
				List<Student> students = StudentManagementDao.getAllStudents();
				for (Student student : students) {
					System.out.println(
							"ID: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge());
				}
				break;
			case 3:
				System.out.print("Enter student ID to delete: ");
				int studentId = scanner.nextInt();
				StudentManagementDao.deleteStudent(studentId);
				break;
			case 4:
				System.out.println("Exiting program.");
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
			}
		}

	}
}
