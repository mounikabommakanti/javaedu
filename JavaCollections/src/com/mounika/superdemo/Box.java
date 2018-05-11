package com.mounika.superdemo;

public class Box {
	private double length;
	private double breadth;
	private double height;

	Box() {
		length = -1;
		breadth = -1;
		height = -1;
	}

	Box(double l, double b, double h) {
		length = l;
		breadth = b;
		height = h;
	}

	Box(Box obj) {
		length = obj.length;
		breadth = obj.breadth;
		height = obj.height;
	}

	Double volume() {
		return length * breadth * height;
	}

}
