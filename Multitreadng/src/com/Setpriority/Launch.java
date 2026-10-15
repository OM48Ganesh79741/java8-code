package com.Setpriority;

public class Launch 
{
	public static void main(String[] args) 
	{
		Statict t=new Statict();
		t.start();
		
		
		//jiski prority high hogi wo pahle execute hoga 
//		but both thread execute simulteneolsy
		Duplicate d=new Duplicate();
		d.setPriority(10);
		d.start();
		
		
		Launch.ramesh();
		
	}
	public static void ramesh()
	{
		System.out.println("**************** static methos is calling******************");
	}

}
