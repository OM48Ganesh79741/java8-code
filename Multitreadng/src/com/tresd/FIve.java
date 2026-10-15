package com.tresd;

public class FIve 
{
 
	public void run()
	{
		
		 for(int i=0;i<5;i++)
		  {
			 try 
			 {
				 //no need to extends thread
				Thread.sleep(3000);
			 }
			 catch (InterruptedException e)
			 {
				
				e.printStackTrace();
			}
			  System.out.println("five");
		  }
	}
}
