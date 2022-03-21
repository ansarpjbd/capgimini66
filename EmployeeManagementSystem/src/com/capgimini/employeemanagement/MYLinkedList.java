package com.capgimini.employeemanagement;

import java.util.Iterator;
import java.util.LinkedList;

public class MYLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();

		list.add(10);
		list.add(30);
		list.add(20);
		list.add(2);

		System.out.println("sublist" +list.subList(2, 3));
		
		
		// adding the value at first location
		list.addFirst(01);

		// adding the value at the last
		list.addLast(100);

		// clear the data
		// list.clear();

		// copy the value from
		// dublicate of list
		LinkedList list2 = (LinkedList) list.clone();

		// value are present in the list or not
		list.contains(10);

		// return the head
		System.out.println(list.element());

		// list.

		// System.out.println(list);
		// printing using java 8
		list.forEach(System.out::println);
		// get the first element
		list.getFirst();

		// get the last element
		list.getLast();

		// get using index
		// list.get(9);

		// add the element at last tail
		list.offer(10);

		list.offerFirst(20);

		list.offerLast(30);

		// return the index of value
		list.indexOf(20);

		// check for list is empty or not
		list.isEmpty();

		// return the object of iterator class
		Iterator it = list.iterator();
		// it tell it has the next element or not
		while (it.hasNext()) {
			// it will give the value
			System.out.println("next " + it.next());
		}
		
		//return the head or first value
		//it do not the first node
		list.peek();
		
		//return the head or first node
		//it will delete the head also
		list.poll();
		
		
		list.peekFirst();
		list.peekLast();
		
		list.pollFirst();
		list.pollLast();
		
		//it will remove the head or first element
		list.remove();
		
		list.remove(10);
		
		list.removeFirst();
		
		list.removeLast();
		
		//remove the matching element of list
		list.removeAll(list2);
		
		//it will print the size of list
		System.out.println(list.size());
		
		
		//break the list to sub list
		list.subList(2, 5);
		
		
		Object[] arr=list.toArray();
		
		//list.
		//list
	}
}
