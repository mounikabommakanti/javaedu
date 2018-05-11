package com.mounika.comparator;

import java.util.Comparator;
import java.util.HashMap;

public class HMComparator extends HashMap<Integer, String> implements Comparator<HashMap<Integer, String>> {

	@Override
	public int compare(HashMap<Integer, String> o1, HashMap<Integer, String> o2) {
		HashMap<Integer, String> hm1 = o1;
		HashMap<Integer, String> hm2 = o2;
		String a = hm1.getValue();
		String b = hm2.toString();
		return b.compareTo(a);
	}

}
