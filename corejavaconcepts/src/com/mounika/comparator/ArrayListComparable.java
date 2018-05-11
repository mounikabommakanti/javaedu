package com.mounika.comparator;

public class ArrayListComparable implements Comparable<String>{

	@Override
	public int compareTo(String arg0) {
		String str=arg0;
		return str.compareTo(this.toString());
	}

}
