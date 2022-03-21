package com.capgmini.day2;

class AA {
	public void printA() {
		System.out.println("Class A");
	}
}

class BB extends AA {
	public void printB() {
		System.out.println("Class B");
	}
}

class C extends BB {
	public void printC() {
		System.out.println("Class C");
	}
}

public class MyMultiLevel {

	public static void main(String[] args) {
		
		C obj=new C();
		obj.printA();
		obj.printB();
		obj.printC();
	}
}
