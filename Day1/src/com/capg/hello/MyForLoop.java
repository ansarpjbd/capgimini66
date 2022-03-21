package com.capg.hello;

public class MyForLoop {

	public static void main(String[] args) {

		// For Loop
		// for is keyword
		// inital value
		// run only one time in loop
		// condition
		// check for condition every time

		// body of loop

		// increment or decrement
		//

		// give the next condition with semi colon

		// int a=1
		// a<=10;
		// a++
		// Entry Control Loops
		for (int a = 1; a <= 10; a++) {
			// print statement is repreating 10 tym
			// System.out.println(a);
		}

		// Read the N value using loop

		// initial value
		int i = 10;
		// keyword condition
		// Entry Control loop
		// condition is checked before executing the body of loop
		while (i > 0) {
			// body of loop
			// System.out.println(i);
			// increment
			i = i - 1;
		}

		// Do while
		// Exit control loop
		// condition is checked after the executing the block of code
		int j = 1;
		do {
			System.out.println(j);
			j = j + 1;
		} while (j <= 10);

	}
}
