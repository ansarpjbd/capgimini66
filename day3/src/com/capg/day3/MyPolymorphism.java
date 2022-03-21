package com.capg.day3;

//pre condition --you should implement inherit first 
//there should same method in base and sub class

//this is runtime polymorhism
//(method overriding )


//compile tym polymorphism
//(method overloading)
class Person {
	public void print() {
		System.out.println("i am person");
	}
	
}

class Office extends Person {
	@Override // print method override the method from the base class
	// that was person office
	//
	public void print() {
		System.out.println("i am employee");
	}
}

class Home extends Person {
	@Override
	public void print() {
		System.out.println("i am Father");
	}
}


class Sum
{
	//method wil have same return type and same but have the different parameters
	public void print(int a)
	{
		System.out.println(a);
	}
	public void print(int a,int b)
	{
		System.out.println((int)a+(int)b);
	}
	public void print(int a,int b,int c)
	{
		System.out.println((int)a+(int)b+(int)c);
	}
	
}

public class MyPolymorphism {
	public static void main(String[] args) {
		//parent class can hold the object or reference of child clas
		Person ansar=new Home();
		ansar.print();
		
		Sum sum=new Sum();
		sum.print(10);
		sum.print(10,20);
		sum.print(10,20,30);
	}
}
