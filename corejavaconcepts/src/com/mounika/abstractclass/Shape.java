package com.mounika.abstractclass;

public abstract class Shape {
	String shapename;

	public abstract int area();

	public abstract int perimeter();

	public String shapeName(String shapename)

	{
		this.shapename = shapename;
		return shapename;
	}
}
