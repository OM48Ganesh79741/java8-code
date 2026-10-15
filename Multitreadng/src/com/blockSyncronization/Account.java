package com.blockSyncronization;

public class Account 
{
	private StringBuffer xyz=new StringBuffer("xyz");
	
	int k=0;
	
	int change=0;
	public void change()
	{
		xyz=xyz.append("a");  //syncronized method hai
		
		synchronized (this) 
		{
			change++;  //race condition not occure   vecz thread is  not overlapp
		}
		k++;  //two thrwad overlap honge ho correct count nahi aayeha (2000) becz syncronization nahi hai
	             
	}
   
	public void get() 
	{
		int count=0;
		for(char c: xyz.toString().toCharArray())
		{
			if(c=='a')
			{
				count++;
			}
		}
		System.out.println("count value is: "+count);
		System.out.println("change  value is: "+change);
		System.out.println("change  value k: "+k);
	}
}
