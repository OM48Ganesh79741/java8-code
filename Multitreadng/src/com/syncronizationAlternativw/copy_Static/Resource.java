package com.syncronizationAlternativw.copy_Static;

public class Resource 
{
	
//	 class level lock pahle ek thread pura execute hoga fir second thread execute hoga because static method share all object 
	public static synchronized  void printer(String name)
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
	
//	op comes zig zag manne because we pass two object then  one tobject method execte beech  me second tead ki method exceue hogi
	public synchronized  void printer2(String name)
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
