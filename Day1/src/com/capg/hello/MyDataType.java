package com.capg.hello;

public class MyDataType {

	public static void main(String[] args) {
		
		//Data Type
		
		//it is used to store the whole number with + and - symobole
		  //  RAM <--10
		//add the data to RAM
		int number=10;
		//int is data type
		//it is keyword also
		//number is the name (identifier)
		//= Assignment operator
		//value
		
		float f=2.0f;
		//it is used to store the fractional number
		//it is always end with f//float
		//it is taking 4 byte in memory 
		
		//Reading the value from RAM
		
		double d=20.00;
		//it is also used to store the fractional value
		//it is taking 8 byte in memory
		
		char c='c';
		//it is used to store the character value
		//it is taking 1 byte only
		
		String str="Hello";
		//Need to store the full line or word
		//String is class in java 
		
		
		boolean flag = false;
		//it is used to store the  boolean value
		//true
		//false
		//one bit in memory
		
		
		System.out.println(number);
		
		System.out.println(f);
		
		System.out.println(str);
		
		System.out.println(d);
		
		System.out.println(flag);
		
		
		
		//delete the value
		//update the value 
		//once you have memory you can update it
		//you can delete the location
		d=0;
		System.out.println(d);
		
		
		char ch='\u0042';
		//able to store the ASCII value
		//char to int
		//ASCII to char is also possible
		//ASCII to unicode
		//unicode to ASCII
		
		//error
		//int connot convert to left data type
		//long bb=2222222222222222222222222222222222222222222222222222;
		//What will happen if you try to give above min and max range
		
		//Compilation Error
		//short
		//Type mismatch: cannot convert from int to short
		//byte
		//Type mismatch: cannot convert from int to byte
		
		//int Error
		//The literal 2222222222222222222222222222222222222222222222222222 of type int is out of range 
		
		
		//long error
		//The literal 2222222222222222222222222222222222222222222222222222 of type int is out of range 
		
		
		System.out.println((int)ch);
		
		
		//Out of Range Error for 
		//Boolean
		//Float
		//Double
	    //char 	
		
		//char char2=97000;
	    //Error -Invalid character constant
		
		//if number id given 
		//Type mismatch: cannot convert from int to char
		
		//double dd=222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333332222222222222222222222222222222222.000;
		//out of range error
		
		
		float ff=1000000.000000000000000000f;
		
		//Out of range error
		//Cannot convert to float value
		
		
		//Boolean myFlag=123;
		
		//cannot convert sconvert
	}
}
