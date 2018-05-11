package com.mounika.comparator;

import java.util.HashMap;

public class ComparatorDemo {
	public static void main(String args[]) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>(new HMComparator());
		hm.put(1, "t");
		hm.put(2, "o");
		hm.put(3, "C");
		hm.put(4, "D");
		System.out.println(hm);
		/*for (int i = 1; i <= hm.size(); i++) {
			System.out.println(hm.get());
		}*/

	}
}
