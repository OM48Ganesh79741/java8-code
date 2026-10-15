package com.tresd;

public class Seven  extends Thread
{
	
	public void run()
	{
		 for(int i=0;i<5;i++)
		  {
			 System.out.println(Thread.currentThread().getName());
			  System.out.println("seven");
		  }
	}

}
