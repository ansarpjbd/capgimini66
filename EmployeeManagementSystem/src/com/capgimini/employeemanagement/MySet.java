package com.capgimini.employeemanagement;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MySet {

	public static void main(String[] args) {
		
		
		//Sorting ASC and DESC will handle by TreeSET
		
		
		TreeSet<Integer> set=new TreeSet<Integer>();
		
		//adding the data to set
		set.add(10);
		set.add(9);
		set.add(20); 
		set.add(5);
		set.add(10); //duplicate
		set.add(10); //duplicate
		set.add(1);
		set.add(8);
		
		//set.clear();
		
		set.contains(100);
		
		set.containsAll(set);
		
		set.isEmpty();
		
		//Collections.sort only work with the list 
		
		//Collections.sort(set);
		
		Iterator<Integer> it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//toString
		System.out.println(set);
		
		set.remove(10);
		
		//set.removeAll(set);
		
		set.size();
		
		
		set.toArray();
		
		
		
		Iterator<Integer> its=set.descendingIterator();
		System.out.println("descending order");
		while(its.hasNext())
		{
			System.out.println(its.next());
		}
	}
	
}
