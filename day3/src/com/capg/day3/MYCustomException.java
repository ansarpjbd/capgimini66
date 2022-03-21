package com.capg.day3;

//write custom exception for even and odd
//print only even number if odd number throw exception

//checked and unchecked 


import java.io.IOException;
import java.util.Scanner;
//checked or unchecked exception

//by default checked exception
//extends IOException class or Exception class

//create a userdined unchecked exception
//always extends RuntimeException
class OnlyPositiveNumberAllowed extends RuntimeException {

	public OnlyPositiveNumberAllowed() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OnlyPositiveNumberAllowed(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public OnlyPositiveNumberAllowed(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public OnlyPositiveNumberAllowed(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public OnlyPositiveNumberAllowed(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}

public class MYCustomException {

	public static void main(String[] args) {

		// User should be able to enter only positive number

		OnlyPositiveNumberAllowed allowed=new OnlyPositiveNumberAllowed();
		allowed.getLocalizedMessage()
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if (num > 0) {
				System.out.println("Number is " + num);
			} else {
				throw new OnlyPositiveNumberAllowed("enter positive number");
				// throws exception saying only positive number are allowed
			}
		

	}

}
