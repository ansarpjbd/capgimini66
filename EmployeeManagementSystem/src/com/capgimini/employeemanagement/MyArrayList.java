package com.capgimini.employeemanagement;


//ArrayList
//LinkedList
//Stack
//Vector

//with User defined Object
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class MyArrayList {
	public static void main(String[] args) {
		// creating the list
		//vector is thread safe
		Vector<Integer> list = new Vector<Integer>();

		//list.push(10);
		
		//list.pop();
		// List<Integer> list2=Arrays.asList(1,2,3,4,5);
		//Constructs an empty list with an initial capacity of ten.

		ArrayList<Integer> list2 = new ArrayList<Integer>(100);

		// adding the data to list
		list.add(30);
		list.add(30);
		list.add(30);
		list.add(20);
		list.add(10);
		list.add(8);

		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);

		// get the value using index
		System.out.println(list.get(0));
		// System.out.println(list);
		// delete all the element of list
		// list.clear();

		// search for given item
		// if found return true
		// if not found return false
		System.out.println(list.contains(8));

		System.out.println(list.indexOf(8));

		// delete the data for index
		list.remove(0);

		// combine or merge two list
		list.addAll(list2);

		for (int obj : list) {
			System.out.println(obj);
		}

		// sort a list
		// Collections class
		// sort method ASC
		Collections.sort(list);

		System.out.println(list);

		Collections.sort(list, Collections.reverseOrder());

		System.out.println(list);

	}
}
