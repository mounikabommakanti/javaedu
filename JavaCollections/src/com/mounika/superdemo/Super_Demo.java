package com.mounika.superdemo;

public class Super_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxWeight boxweight=new BoxWeight(1,2,3,4);
		BoxWeight bw1=new BoxWeight(boxweight,5);
		System.out.println("Volume of box :boxweight initialized with parameterized constructor: "+boxweight.volume());
		System.out.println("Volume of box:bw1 initialized passing object: "+bw1.volume());
		}

}
