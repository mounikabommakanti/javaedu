package com.mounika.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> linkedlist=new LinkedList<Integer>();
		linkedlist.add(1);
		linkedlist.add(2);
		linkedlist.add(3);
		Iterator<Integer> itr1=linkedlist.iterator();
		System.out.println("initial set of elements in linkedlist: ");
		while(itr1.hasNext())
			System.out.println(itr1.next());
		linkedlist.removeFirst();
		linkedlist.addFirst(3);
		linkedlist.removeLast();
		linkedlist.addLast(1);
		Iterator<Integer> itr2=linkedlist.iterator();
		System.out.println("Second set of elements in linkedlist after adding and removing elements: ");
		while(itr2.hasNext())
			System.out.println(itr2.next());
		
		

	}

}
