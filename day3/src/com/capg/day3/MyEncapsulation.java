package com.capg.day3;

//Create A class with 
//Employee 
//Dept
//Parking
//Address


//Do not keep the data member opens
//Any one outside and update or delete the value in variable
//make the member private
//No outside can access the variable
//only the method of same class can have access to variable
class Students {

	// variable are private
	private String name;
	// only class method will have the access to these properties
	private int rollno;
	private double fees;

	public Students(String name, int rollno, double fees) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.fees = fees;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", rollno=" + rollno + ", fees=" + fees + "]";
	}
}

public class MyEncapsulation {

	public static void main(String[] args) {

		Students s = new Students("Ansar", 1001, 5000);

		// you will be able the set the value using the setter
		s.setName("abc");
		// get the name using the getter value
		System.out.println(s.getName());
		System.out.println(s.toString());
	}
}
