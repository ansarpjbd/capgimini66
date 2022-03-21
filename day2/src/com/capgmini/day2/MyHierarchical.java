package com.capgmini.day2;

class Super {
	public void printSuper() {
		System.out.println("print Super");
	}
}

class ChildOne extends Super {
	public void printChildOne() {
		System.out.println("print ChildOne");
	}
}

class ChildTwo extends Super {
	public void printChildTwo() {
		System.out.println("print ChildTwo");
	}
}

public class MyHierarchical {
	public static void main(String[] args) {

		ChildOne childOneObj = new ChildOne();
		childOneObj.printSuper();
		childOneObj.printChildOne();

		//
		ChildTwo childTwoObj = new ChildTwo();
		childTwoObj.printSuper();
		childTwoObj.printChildTwo();
	}

}
