package com.capg.day3;
//interface can be defined with or without abstract keyword
//it provides the 100 per abstraction
//it is the work only and implementation is given later 
 abstract interface Employee {
	//not able to give body of method
	//only the declaration is allowed
      abstract public void print();
}
 //abstract class
 //will have the abstract method and non abstract method
 //need to add the abstract keyword with method and class name
 //this class needs to be extends
 //implement the unimplemented method
 abstract class Parking
{
	abstract  public void printParking();
	public void printPrice()
	{
		System.out.println("150");
	}
}



//Interface needs to implemented by any class
//if this is not implemented than there is not use of it


class Dept
{
	public void printDept()
	{
		System.out.println("Priting the deptment ");
	}
}
//interface allow us to do the multiple inheritance
//first extending the class Dept
//implemented the class Employee there
class Company extends Parking implements Employee
{
//you have implement the unimplemented method
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Method interface example");
	}

	@Override
	public void printParking() {
		// TODO Auto-generated method stub
		System.out.println("I am parking abstract class");
	}
	
	
	
}

public class MyAbstractions {

	public static void main(String[] args) {
		
		Company company=new Company();
		company.print();
		//company.printDept();
		company.printParking();
		company.printPrice();
		
	}
}
