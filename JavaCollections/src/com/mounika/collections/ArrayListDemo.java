package com.mounika.collections;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arrayListInt = new ArrayList<Integer>();
		int sum = 0;
		arrayListInt.add(1);
		arrayListInt.add(2);
		arrayListInt.add(3);
		System.out.println("first elemnet of arraylist: " + arrayListInt.remove(0));
		Integer[] arrayInt = new Integer[arrayListInt.size()];
		arrayInt = arrayListInt.toArray(arrayInt);
		for (int i : arrayInt)
			sum += i;
		System.out.println("sum of elements of the arraylist: " + sum);
	}

}
