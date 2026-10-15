package com.DeadLock;

public class Resource extends Thread
{
	private String res1="RES1";
	private String res2="RES2";
	private String res3="RES3";
	
	
	public void run()
	{
		String name=Thread.currentThread().getName();
		
		    if(name.equals("raju"))
		    {
		    	rajuAccess(name);
		    }
		    else
		    {
		    	kajuaccess(name);
		    }
		
	}

	
	
//	kaju aur raju jab suncronized black chodega  tab raju aur kaju accss kar payenge iske liye nested banaya hai

//	private void kajuaccess(String name) 
//	{
//		
//		synchronized (res1) 
//		{
//			System.out.println(name+" using "+res1);
//		}
//		synchronized (res2) 
//		{
//			System.out.println(name+" using "+res2);
//		}
//		synchronized (res3) 
//		{
//			System.out.println(name+" using "+res3);
//		}
//	}
//
//
//	private void rajuAccess(String name) 
//	{
//		synchronized (res1) 
//		{
//			System.out.println(name+" using "+res1);
//		}
//		synchronized (res2) 
//		{
//			System.out.println(name+" using "+res2);
//		}
//		synchronized (res3) 
//		{
//			System.out.println(name+" using "+res3);
//		}
//	}
	
	
	
	
//	***************************************************************

	
//	2.syncronized nested block
//	pahle ek ka excution khatam hoga fir dusre ko milega
//	nested hai syncronized lock relese hone pr dusre thread ko nahi milega
	
	
//	private void kajuaccess(String name) 
//	{
//		
//		synchronized (res1) 
//		{
//			System.out.println(name+" using "+res1);
//			
//			synchronized (res2) 
//			{
//				System.out.println(name+" using "+res2);
//			}
//			
//			synchronized (res3) 
//			{
//				System.out.println(name+" using "+res3);
//			}
//			
//		}
//		
//	
//	}
//
//
//	private void rajuAccess(String name) 
//	{
//		synchronized (res1) 
//		{
//			System.out.println(name+" using "+res1);
//			
//			synchronized (res2) 
//			{
//				System.out.println(name+" using "+res2);
//			}
//			
//			synchronized (res3) 
//			{
//				System.out.println(name+" using "+res3);
//			}
//		}
//		
//		
//	}
	
	
//	            *********** outPut ***********
//	
	
//	raju using RES1
//	raju using RES2
//	raju using RES3
//	kaju using RES1
//	kaju using RES2
//	kaju using RES3
	
	
	
	//*************************************************************************
	
	
//	3rd condition deadlock
//	ovrcome deadLock: access multiple resource in same manner

//thread 1 acess reaource 2 then resource 2
//thread 2 access resource  3 then resource 2
//both complete their executin and try to access resource 2 at a time then  deadlock happen because syncronized hai confuse wgich thread handle first

	private void kajuaccess(String name) 
	{
		
		synchronized (res1) 
		{
			System.out.println(name+" using "+res1);
			
			synchronized (res2) 
			{
				System.out.println(name+" using "+res2);
			}
			
			synchronized (res3) 
			{
				System.out.println(name+" using "+res3);
			}
			
		}
		
	
	}


	private void rajuAccess(String name) 
	{
		synchronized (res3) 
		{
			System.out.println(name+" using "+res3);
			
			synchronized (res2) 
			{
				System.out.println(name+" using "+res2);
			}
			
			synchronized (res1) 
			{
				System.out.println(name+" using "+res1);
			}
		}
		
		
	}
















}
