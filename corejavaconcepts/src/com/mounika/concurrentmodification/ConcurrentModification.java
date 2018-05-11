package com.mounika.concurrentmodification;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModification {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {
			Integer value = it.next();
			System.out.println(value);

			if (value == 3)
				al.remove(3);
		}
	}
}
