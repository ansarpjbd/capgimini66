package com.capg.hello;

import java.util.*;

public class MyIFElseLadder {
	public static void main(String[] args) {

		// Read the day Number and print the day name
		Scanner sc = new Scanner(System.in);

		// if day 1 (Sunday)
		// day is 2 MOn
		// day 3 tue
		// day 4 wed
		// day 5 thu
		// day 6 fri
		// day 7 Sat
		System.out.println("Enter the Day Number");
		int day = sc.nextInt();
		if (day == 1) {
			System.out.println("Sun");
		} else if (day == 2) {
			System.out.println("Mon");
		} else if (day == 3) {
			System.out.println("Tue");
		} else if (day == 4) {
			System.out.println("Wed");
		} else if (day == 5) {
			System.out.println("Thu");
		} else if (day == 6) {
			System.out.println("Fri");
		} else if (day == 7) {
			System.out.println("Sat");
		} else {
			System.out.println("Wrong Day number");
		}

	}
}
