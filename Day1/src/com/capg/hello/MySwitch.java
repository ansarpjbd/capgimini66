package com.capg.hello;

import java.util.Scanner;

//Write a program to read the number from user and print even or odd 
//Read the int value and Print the char 
//Read the Number from User and Print the Month Name
//If else
//Switch

public class MySwitch {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();

		// switch keyword
		// condition
		// Switch case should not be duplicate
		switch (day) {
		case 1:
			System.out.println("Sun");
			break;

		case 2:
			System.out.println("Mon");
			break;

		case 3:
			System.out.println("Tue");
			break;

		case 4:
			System.out.println("Wed");
			break;
		case 5:
			System.out.println("Thu");
			break;

		case 6:
			System.out.println("Fri");
			break;

		case 7:
			System.out.println("Sat");
			break;

		default:
			System.out.println("Wrong Value");

		}

	}
}
