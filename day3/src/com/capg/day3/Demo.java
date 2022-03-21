package com.capg.day3;

class Student extends Object {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	String name;
	int id;

//No constructor here

	// empty class

	//String representation of an object
	//it will return the hash code in hexadecimal with package and class name
	
	@Override
	public String toString() {
		return "[name] " + this.name + "\n [ id ] " + this.id;
	}

	//it is used to compare two object 
	//both are object so we override it compare the attributes
	//it this method is not override then it will compare on hashcode
	
	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		if (this.name.equalsIgnoreCase(s.getName())) {
			return true;
		} else {
			return false;
		}

	}

}

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// default constructor created by compiler
		Student student = new Student();
		student.name = "Ansar";

		// getting the current class object
		System.out.println(student.getClass());

		// hashCode --it return the hash code value of object
		// code which used for hashing
		// index value for list of object
		// give the index and search for object
		System.out.println(student.hashCode());

		// toString
		// package Name +class
		// com.capg.day3.Student@hashcode(hexadeciamal)
		// com.capg.day3.Student@15db9742
		System.out.println(student.toString());
		// internally calls the to String method
		System.out.println(student);

		// equals --check both object are equal or not
		// When both have the same hashcode then object are equal
		System.out.println(student.equals(student));

		Student s2 = new Student();
		s2.name = "ansar";
		// System.out.println(s2.hashCode());
		System.out.println(student.equals(s2));

		// copy and create and return the same object
		// Student s3=student.clone();

		// ask the thread to wait and stop the execution
		// student.wait(1000);

		// all get back to work
		// student.notifyAll();

		// get back to work curent thread
		// student.notify();

		// System.gc();

		System.out.println(student.equals(s2));
	}

}
