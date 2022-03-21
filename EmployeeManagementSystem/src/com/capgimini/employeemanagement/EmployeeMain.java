package com.capgimini.employeemanagement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// Array of object
		Employee list[] = new Employee[10];

		int counter = 0;

		// Employee ansar = new Employee(100, "Ansar", 1000,dateFormat.format(date));
		// System.out.println(ansar.toString());

		// list[0] = ansar;

		// System.out.println(list[0].toString());

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter Choice !");
			System.out.println("Press 1 for Add Employee ");
			System.out.println("Press 2 for Create New Employee List  ");
			System.out.println("Press 3 for Edit Employee");
			System.out.println("Press 4 for Print maximum Salary Employee ");
			System.out.println("Press 5 for Print minimum Salary Employee ");
			System.out.println("Press 6 for Print Sort the Salary of Employee ");
			System.out.println("Press 7 for Print Sort the Name of Employee ");
			System.out.println("Press 8 exit");
			System.out.println("Press 9 for Display the List");
			int choice = sc.nextInt();

			if (choice == 1) {

				System.out.println("Enter the employee name");
				String name = sc.next();

				// System.out.println("choice "+choice);
				System.out.println("Enter the employee id");
				int id = sc.nextInt();

				System.out.println("Enter the employee salary");
				double salary = sc.nextDouble();

				// taking the current date starts

				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				Date date = new Date();
				// System.out.println(dateFormat.format(date));
				// current date logic ends

				String newdate = dateFormat.format(date);
				Employee employee = new Employee(id, name, salary, newdate);
				list[counter] = employee;
				counter = counter + 1;

			} else if (choice == 3) {
				int count = 0;
				for (Employee e : list) {
					// if object employee is not null then print
					if (e != null) {
						System.err.println("Press " + count + " " + e);
					}
					count=count+1;
				}
				int editChoice = sc.nextInt();
				System.out.println("Press One for update Name ");
				System.out.println("Press Two for update salary ");
				System.out.println("Press Three for update ID ");

				// taking the update object data
				
				int editOption = sc.nextInt();
				if (editOption == 1) {
					System.out.println("Enter New Name");
					list[editChoice].setName(sc.next());
				}
				if (editOption == 3) {
					System.out.println("Enter New ID");
					list[editChoice].setId(sc.nextInt());
					System.err.println("ID has been Updated !");
				}
				if (editOption == 2) {
					System.out.println("Enter New Salary");
					list[editChoice].setSalary(sc.nextDouble());
				}
				else
				{
					System.err.println("Wrong update Choice");
				}
			}

			else if (choice == 8) {
				// Continue--which will run with next iteration and skip the current iteration
				// break will end the loop
				break;
			} else if (choice == 9) {

				for (Employee e : list) {
					// if object employee is not null then print
					if (e != null) {
						System.err.println(e);
					}
				}
			} else {
				System.out.println("Wrong chocie try again");
			}

		}

	}

}
