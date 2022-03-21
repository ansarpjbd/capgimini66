package com.capgimini.employeemanagement;

import java.sql.Date;

//POJO
public class Employee
{
	// local variable
	private int id;
	private String name;
	private double salary;
	private String doj;

	// default constructor
	public Employee() {
	}

	// constructor with parameters
	public Employee(int id, String name, double salary, String doj) {

		this.id = id;
		this.name = name;
		this.salary = salary;
		this.doj = doj;
	}

	// getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	// toString method for printing
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", doj=" + doj + "]";
	}

	/*@Override
	public int compareTo(Employee obj2) {

		// need to compare two class object here
		// one object we are receiving as parameters obj2
		// use the this keyword the access the class variable
		// Return 1 if first object has greater than object 2
		// Return -1 if first object has less than object 2
		// return 0 if both the object are equal
		return  this.getName().compareTo(obj2.getName());
	}*/
}
