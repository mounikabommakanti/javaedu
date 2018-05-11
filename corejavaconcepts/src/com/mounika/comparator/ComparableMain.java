package com.mounika.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableMain {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("D");
		al.add("B");
		al.add("C");
		Collections.sort(al);
		System.out.println(al);
	}

}
