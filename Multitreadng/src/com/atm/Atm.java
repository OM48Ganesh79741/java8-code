package com.atm;

import java.util.Scanner;

public class Atm extends Thread
{
	int pass=123;
	int chances=3;
	int count=0;
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		Atm atm=new Atm();
		atm.start();
		
	}
	
	public void run()
	{
		
		System.out.println("please enter the password: ");
		int newpass=sc.nextInt();
		
		if (pass==newpass)
		{
			System.out.println("login succesfully: ");
			
		}
		else
		{
			++count;
			System.out.println(" you have :: "+(chances=chances-count));
		}
		
		
		
	}
	
	

}
