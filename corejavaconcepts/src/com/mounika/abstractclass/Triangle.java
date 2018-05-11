package com.mounika.abstractclass;

public class Triangle extends Shape {
	int side1, side2, side3;

	public Triangle(int side1, int side2, int side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	public int area() {
		double s = (side1 + side2 + side3) / 2;
		return (int) (Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)));

	}

	@Override
	public int perimeter() {
		return (side1 + side2 + side3) / 2;
	}

	public static void main(String[] args) {
		Triangle triangle = new Triangle(3, 3, 3);
		System.out.println(triangle.area());
		System.out.println(triangle.perimeter());

	}

}
