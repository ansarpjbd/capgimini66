package com.capgmini.day2;

//Inheritance concept
//extends keyword is used to extends one class properties to another class
//variable
//method
//use extends after give class name

//Rule for Inheritance
//need to use the extends keyword
//First class is base class, Parent , Super
//second class called child class, Sub ,
class A {
	String name;

	A() {

	}

	A(String name) {
		this.name = name;
		System.out.println("name is constructor " + name);
	}

	public void printA() {
		System.out.println("Print A");
	}

}

//Class B is capable of using the properties of class A
//Single Level Inheritaces
class B extends A {

	B() {
		// super() method is used to call the parent class constructor
		super("Ansar");
		// super();
	}

	public void printB() {
		// super keyword is used to call any method from parent class
          super.printA();
		System.out.println("Print B");
	}

}

public class MyInheritance {

	public static void main(String[] args) {

		// B has the method and attribute from both the classes
		// not creating the obj of A class

		B obj = new B();
		obj.printB();
	}

}
