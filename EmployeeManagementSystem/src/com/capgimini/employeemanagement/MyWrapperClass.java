package com.capgimini.employeemanagement;

public class MyWrapperClass {
	public static void main(String[] args) {

		// Using wrapper classes we can convert from one datatype to antoher datatype
		int num = 10;

		Integer num2 = new Integer(num);
		// sending or writing into file or internet
		Byte b = num2.byteValue();
		System.out.println(b);
		
		//use to convert to string value to int value
		String str = "11";
		Integer num3 = Integer.parseInt(str);
		
		
		int num4 = num3 + num2;
		
		double d=num2.doubleValue();
		String str1=num2.toString();
		
		Float f=new Float(d);
		
		f.byteValue();
		f.doubleValue();
		f.compareTo(f);
		f.intValue();
		f.longValue();
		f.shortValue();
		System.out.println(f.MAX_VALUE);
		System.out.println(f.MIN_VALUE);
		
	}
}
