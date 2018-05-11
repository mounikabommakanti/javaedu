package com.mounika.superdemo;

public class BoxWeight extends Box{
	private double weight;
	BoxWeight(){
		super();
		weight=-1;
	}
	BoxWeight(double l, double b, double h,double w){
		super(l,b,h);
		weight=w;
		}
	BoxWeight(BoxWeight obj,double w )
	{
		super(obj);
		weight=w;
	}
	
}
