package com.syncronizationAlternativw;

public class Resource 
{
	
	public synchronized void printer(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(name +" : NAME USING PRINTER");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
