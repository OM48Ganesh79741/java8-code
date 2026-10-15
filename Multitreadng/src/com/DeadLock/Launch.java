package com.DeadLock;

public class Launch 
{
	public static void main(String[] args) 
	{
		Resource r1=new Resource();
		Resource r2=new Resource();
		
		r1.setName("raju");
		r2.setName("kaju");
		
		r1.start();
		r2.start();
	}

}


//op

//raju using RES3
//raju using RES2
//kaju using RES1
//kaju using RES2
