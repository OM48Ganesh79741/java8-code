package com.syncronizationAlternativw.copy_Static;

public class Launch
{
	public static void main(String[] args) 
	{
		
//		symcronization
//		Resource r1= new Resource();
//		
//		
//		User u1=new User(r1);
//		User u2=new User(r1);	Resource r1= new Resource();
		
		
		
		
//	object locking --	symiltaneouly print  becz we pass two object  method syncronized jai pr do object hai
		Resource r1= new Resource();
		Resource r2= new Resource();
		User u1=new User(r1);
		User u2=new User(r2);
		
		
		
		
		
		
		
		u1.start();
		u2.start();
		
		
	}

}
