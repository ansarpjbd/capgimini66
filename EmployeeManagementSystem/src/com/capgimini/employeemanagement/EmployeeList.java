package com.capgimini.employeemanagement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;


//Create A ArrayList of Employee
//Add the EMployee to list
//Delete the Employee to List
//Update the EMployee to list
//Sorting on List base on Name and salary and doj
//Searching using ID and Name


public class EmployeeList {

	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		// System.out.println(dateFormat.format(date));
		// current date logic ends

		String newdate = dateFormat.format(date);
		List<Employee> ls = new ArrayList<Employee>();
		Employee ansar = new Employee(1002, "Ansar", 1000, newdate);
		Employee kumar = new Employee(1001, "Kumar", 500, newdate);
		Employee Mahesh = new Employee(1005, "Mahesh", 300, newdate);
		Employee Priya = new Employee(1000, "Priya", 5000, newdate);

		ls.add(ansar);
		ls.add(kumar);
		ls.add(Mahesh);
		ls.add(Priya);
		//in case comparator pass list and comparaters object
		SortByID byID=new SortByID();
		Collections.sort(ls,new SortByID());
		Collections.sort(ls,new SortByName());
		
		for(Employee e:ls)
		{
			System.out.println(e);
		}
	}

}
