package com.waitandnotify2;

public class Driver
{
	public static void main(String[] args) 
	{
		totalEarning t=new totalEarning();
		Earning e=new Earning(t);
		e.start();
		synchronized (t) {
			
		
		try {
			t.wait();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		}
		Earning e1=new Earning(t);
		e1.start();
		
	}

}
