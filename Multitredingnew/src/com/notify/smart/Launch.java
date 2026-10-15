package com.notify.smart;

public class Launch 
{
	public static void main(String[] args) 
	{
		
		 TotalEarning te=new  TotalEarning();
		 te.start();
//	
//		
		 System.out.println("main statrted");
		 
		 synchronized (te)
		 {
			 try {
				te.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println("total earing is: "+te.total);
		}
		 System.out.println("complete");
		 
		 
		 
		 
		
	}

}
