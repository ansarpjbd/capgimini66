package com.capg.hello;

public class MyDecisionMaking {

	//main method
	//it is starting point of java class
	public static void main(String[] args) {
	    
		//skip some flow of code as some condition
		//int value as 10
		int a=-10;
		//int value as 20
		int b=-20;
		//adding th 10 and 20
		//Decision making statement
		//if block
		//Operator 
		  //= (Assignment operator)
		 // >  (greater than)
		 //<   (less than)
		// == (compare two value)
		//>=
		//<=
		//&&   logical And (condition1) && (condition2)
		 //return true 
		 //else false
		//||  logical OR  (condition1) || (condition2)
		//if one is true it will return the true
		//if both are false then it return the false
		int c=0;
//if both the value are greater than zero then provide the sum
		if(a>0 && b>0)
		{
			//Nested IF
			if(a==5)
			{
			c = a + b;
			System.out.println(c);
			}
		}
		else
		{
			System.out.println("Enter Only Positive Number");
		}
		//printing 
		
	}
}
