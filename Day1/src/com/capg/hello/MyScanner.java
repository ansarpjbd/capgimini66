package com.capg.hello;

//Import -it help to import the class from others package 
//package name
import java.util.Scanner;

//Scanner --it is a class in java

//it is used to read the value from input keyboard
//Eclipse --format the code (Ctlr+Shif+F)
public class MyScanner {
	public static void main(String[] args) {

		// System.in --it will read from keyboard
		Scanner sc = new Scanner(System.in);

		// read a int value and display it
		String msg = "Enter the integer value :";
		System.out.println(msg);
		//int num = sc.nextInt();
		//String output = "Printing the value " + num;
		//System.out.println(output);
		
		//reading the float value
		//float f=sc.nextFloat();
        //System.out.println(f);
		//reading the double value
		//double d=sc.nextDouble();
	   // System.out.println(d);
		//reading the one word or string
		//it will break after the space or next line
		//String str=sc.next();
		//System.out.println(str);
		//reading the line 
		//String strLine=sc.nextLine();
		//System.out.println(strLine);
		//reading the long
		//long l=sc.nextLong();
		//System.out.println(l);
		//reading the boolean
		//boolean flag=sc.nextBoolean();
		//System.out.println(flag);
		
		
		//How to read a character 
		String str=sc.next();
		//read the string value
		//then use the charAT method to read the location of char
		//it will print it
		System.out.println(str.charAt(0));
		
		
		
	}
}
