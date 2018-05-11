package com.mounika.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorMain {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		Comparator<String> comp = new ArrayListComparator();
		Collections.sort(al, comp);
		System.out.println(al);
	}

}
