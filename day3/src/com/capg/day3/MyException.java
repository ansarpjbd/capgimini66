package com.capg.day3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//Try with

//5 Unchecked Exception and print it
//5 Checked Exception  and print it


public class MyException {

	public static void main(String[] args) {
		int c = 0;
		
		
		try {
			int a = 10;
			int b = 0;
               
			String str=null;
			
			FileInputStream file=new FileInputStream("C:\\hello.txt");
			
			//java.lang.NullPointerException
			//thrown by string class
			
			//System.out.println(str.charAt(0));
			
			// there rule
			// you cannot divide any value by zero

			//c = a / b;
			
			int arr[]=new int[5];
			arr[6]=34;
            // java.lang.ArrayIndexOutOfBoundsException
			
			System.out.println(c);
			// Exception class -ArithmeticException
			// Exception Message: / by zero

			// Exception in thread "main" java.lang.ArithmeticException: / by zero
			// at com.capg.day3.MyException.main(MyException.java:12)
		} 
		catch (ArithmeticException e) {
			// TODO: handle exception
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		
		catch (FileNotFoundException e) {
			// TODO: handle exception
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
//unchecked exception(RuntimeException)
//you have to declare the child class first and then you can take the parent class
//java.lang.NullPointerException
//java.lang.ArrayIndexOutOfBoundsException
//java.lang.ArithmeticException


//checked exception(IOException)
//FileNotFoundException
