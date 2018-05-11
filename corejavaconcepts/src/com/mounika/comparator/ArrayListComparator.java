package com.mounika.comparator;

import java.util.Comparator;

public class ArrayListComparator implements Comparator<String> {

	@Override
	public int compare(String arg0, String arg1) {
		String a = arg0;
		String b = arg1;
		return b.compareTo(a);
	}

}
