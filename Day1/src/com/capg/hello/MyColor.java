package com.capg.hello;

//Create the ENUM for ALL Day of Week
//Create the ENUM for All the Month of a year
enum Color {
	RED, GREEN, YELLOW, BLUE
}

public class MyColor {

	public static void main(String[] args) {
       
		//TO Read the once value from ENUM
		Color value=Color.BLUE;
      
		//Reading all the value from ENUM
		Color[] str=  Color.values();
		
		//Advance FOr Loop
		for(Color c:str)
		{
			//System.out.println(c);
		}
		//It will take the constant name and return the value
		System.out.println(Color.valueOf("BLUE"));
		
		//System.out.println(Color.RED);
		
	}

}
