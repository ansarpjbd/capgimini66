package com.capgimini.employeemanagement;

import java.util.Comparator;

//Comparable- we write the sorting logic with the model itself
//Comparator- we will implement the comparator 
//we will create different class for key
//we will receive two object a time
public class SortByID implements Comparator<Employee> {

	@Override
	public int compare(Employee obj1, Employee obj2) {
		// TODO Auto-generated method stub
		if (obj1.getId() > obj2.getId()) {
			return -1;
		} else if (obj1.getId() < obj1.getId()) {
			return 1;
		} else {
			return 0;
		}
	}

}
