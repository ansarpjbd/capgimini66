//Create the Class and Object FOr following

//1.Mouse
//2.Student
//3.Car
//4.PEN
//5.Mobile
//6.See your NearBy and Create 


//Constructor
//Setter 
//Getter
//Print Method





package com.capgmini.day2;

//store the value of object
//we can create multiple object of employee
//this class is called the POJO class
//POJO --plain old java object
//Model Class--Model is class which hold the value for object

class Employee {
	
	//member variable(attribute)
	String name;
	double salary;
	int age;

//member method	
	// constructor
	// it is special method in java class
	// it is used to give the value to variable (member variable initilzation)
	// it will have the same name as class name
	// it will not have any return type
	// it will always have public
	// we can have multiple constructor with different parameters (constructor
	// overloading)
//it is not taking any parameters 

//if we will not create constructor then compiler will create it
	// it is called default constructor
	public Employee() {

	}

	// parameterized constructor
	// this will denote to the class variable
	public Employee(String name, double salary, int age) {
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	// parameterized constructor with one parameters
	public Employee(String name) {

	}

	// parameterized constructor with one parameters
	public Employee(double salary) {

	}

	// parameterized constructor with one parameters
	public Employee(String name, double salary) {

	}
//getter and Setter

//getter is used to get the value from variable
	// setter for name
	public void setName(String name) {
		this.name = name;
	}

	// setter for age
	public void setAge(int age) {
		this.age = age;
	}

	// setter for salary
	public void setSalary(double salary) {
		this.salary = salary;
	}

	// get name
	public String getName() {
		return this.name;
	}

	// get salary
	public double getSalary() {
		return this.salary;
	}

	// get age
	public int getAge() {
		return this.age;
	}
//setter is used to set the value to variable

	// print method
	// method name start with lower case
	public void printValue() {

		System.out.println("Name " + this.name);
		System.out.println("age  " + this.age);
		System.out.println("Salary " + this.salary);
	}

}

public class MyClass {

	public static void main(String[] args) {

		// creating the object of employee
		Employee ansar = new Employee();
		ansar.setName("Ansar");
		ansar.setAge(35);
		ansar.setSalary(100);
		//ansar.printValue();
		
		
		//access the variable
		//ansar.age=20;
		
		
		//access the method
       //ansar.printValue();
		
		
		System.out.println("Name "+ansar.getName());
		System.out.println("Salary "+ansar.getSalary());
		System.out.println("Age "+ansar.getAge());
		
		//Object Class in Java
		//Parent of each class
		ansar.equals(ansar);
		ansar.hashCode();
		ansar.notify();
		ansar.notifyAll();
		ansar.toString();
		//ansar.wait(1000);
		
	}

}
