package com.capgimini.employeemanagement;

//Generic always work with wrapper class
// 2004 within version J2SE 5.0.
class EmployeeGeneric<T,Y> {
	//data type is binded to class variable
	//tight coupling
	
	//ArrayList
	
	//loose coupling
	private T id;
	private Y name;

	public EmployeeGeneric(T id,Y name) {
		this.id = id;
		this.name=name;
	}

	public void setId(T id) {
		this.id = id;
	}

	public T getID() {
		return this.id;
	}

	public void print() {
		System.out.println("ID " + this.id);
		System.out.println("Name "+this.name);
	}
}

public class MyGenric {
	public static void main(String[] args) {

		EmployeeGeneric<Integer,String> ansar=new EmployeeGeneric<Integer,String>(1001,"name");
		ansar.print();
		
		EmployeeGeneric<String,Integer> kumar=new EmployeeGeneric<String,Integer>("1001",123);
		kumar.print();
		
		EmployeeGeneric<Double,String> doublevalue=new EmployeeGeneric<Double,String>(1001.00,"java");
		doublevalue.print();
	}

}
