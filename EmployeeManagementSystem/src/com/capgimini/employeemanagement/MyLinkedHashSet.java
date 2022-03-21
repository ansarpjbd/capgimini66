package com.capgimini.employeemanagement;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class MyLinkedHashSet {

	public static void main(String[] args) {
		
		//LinkedHashSet
		//it maintain the insertion order
		//it does not hold the duplicate value
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(20);
		set.add(8);
		set.add(15);
		
		//add or merge two set
		set.addAll(set);
		//clear the set
		set.clear();
		
		set.contains(10);
		
		set.isEmpty();
		
		set.iterator();
		
		set.remove(10);
		
		set.size();
		
		set.spliterator();
		
		System.out.println(set);
	}
}
