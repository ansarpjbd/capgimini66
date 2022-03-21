package com.capgimini.employeemanagement;

import java.util.Arrays;
//Search
//sorting Asc Desc
//find the largest 
//find the smallest number

//Object ()
public class MyMain {
	public static void main(String[] args) {

		String a[] = { "Zee", "Johan", "Kumar", "Ajay", "Mahesh", "Priya", "Rani" };

		//String str1 = "D";
		//String str2 = "A";

		// make use of compare to method
		//System.out.println((int) str1.charAt(0));
		//System.out.println((int) str2.charAt(0));

		// return the value 0 if the argument string is equal tothis string;
		// a value less than 0 if this string is lexicographically less than the string
		// argument;
		// and avalue greater than 0 if this string islexicographically greater than the
		// string argument.

		// if str1 is equal to str2 return 0;
		// if str1 is greater than str2 return differene (positive number)
		// if str1 is less than str2 negative number

		//int diff = str1.compareTo(str2);
		//System.out.println("result " + diff);

		// find the largest of these number

		// largest number as zero
		// int num = 0;

		// iterate the array
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				if (a[j].compareTo(a[i]) > 0) {
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}

		for (int j = 0; j < a.length; j++) {
			 System.out.println(a[j]);
		}
		// System.out.println(num);

		/*
		 * System.out.println("minimum number "+a[0]); int size=a.length-1; //array
		 * index start with zero System.out.println(a.length);
		 * System.out.println("maximum number "+a[size]);
		 */
	}
}
