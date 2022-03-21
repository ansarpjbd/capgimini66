package com.capgmini.day2;

class BaseOne {
	public void print() {
		System.out.println("class Base One");
	}
}

class BaseTwo {
	public void print() {
		System.out.println("class Base two");
	}
}
//there is no way to extends the two base classes in one class
//multiple inheritance is not supported in java

//Hybrid is not supported in Java
//if you try to implements this it will give the compiler time error
class Child extends BaseOne BaseTwo
{
	public void print() {
		System.out.println("class Base two");
	}
}

public class MYMultiple {

	public static void main(String[] args) {
		
	}
}
