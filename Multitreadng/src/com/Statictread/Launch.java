package com.Statictread;

public class Launch 
{
	public static void main(String[] args) 
	{
		Statict t=new Statict();
		t.start();
		
		Duplicate d=new Duplicate();
		d.start();
		
		Launch.ramesh();
		
	}
	public static void ramesh()
	{
		System.out.println("**************** static methos is calling******************");
	}

}
