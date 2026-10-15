package com.isintrepted;

public class Isintrupt1 extends Thread
{
	public static void main(String[] args) 
	{
		
		Isintrupt1 e=new Isintrupt1();
		e.start();
		e.interrupt();
	
	}
	public void run()
	{
//		System.out.println(Thread.interrupted());
		System.out.println(Thread.currentThread().isInterrupted());
		System.out.println(Thread.interrupted());
			try {
				    for(int i=0;i<5;i++)
				    {

				       System.out.println(i);
				       Thread.sleep(2000);
				       System.out.println(Thread.interrupted());
			        }
				 }catch (InterruptedException e)
			        {
				      // TODO Auto-generated catch block
				       e.printStackTrace();
			         }
		
		       
		
	}

}
