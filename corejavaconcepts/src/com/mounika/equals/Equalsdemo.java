package com.mounika.equals;

public class Equalsdemo {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("apple");
		StringBuilder sb2 = new StringBuilder("apple");
		if ((sb1.toString()).equals(sb2.toString()))
			System.out.println("same using equals method");

		if (sb1 == sb2)
			System.out.println("same sb");
		else if (sb1 != sb2)
			System.out.println("different using ==");
	}

}
