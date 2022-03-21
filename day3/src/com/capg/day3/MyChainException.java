package com.capg.day3;

//throws --it is used to throw the exception at method level
class Persons  {

	// throwing back to MyChainException inside main method
	public void print() throws Exception {

		String str = new String();
		// Null Pointer Exception
		System.out.println(str.charAt(0));

	}

}

public class MyChainException {

	// throwing exception to compiler
	public static void main(String[] args) {
		try {
			Persons p = new Persons();
			//p.
			p.print();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception message");
		}
	}

}
