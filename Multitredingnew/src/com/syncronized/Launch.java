package com.syncronized;

public class Launch  extends Thread
{
	static SyncronizedClass c1;
	
	int seat;
	public static void main(String[] args)
	{
		c1=new SyncronizedClass();
		
	    Launch l1=new Launch();
	    l1.seat=5;
		l1.start();
		
		

	    Launch l2=new Launch();
	    l2.seat=9;
		l2.start();
	}
	
	public void run()
	{
		c1.bookseat(seat);
	}

}
