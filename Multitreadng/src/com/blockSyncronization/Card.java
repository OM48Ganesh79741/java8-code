package com.blockSyncronization;

public class Card extends Thread
{
   private Account account;
   
   public Card(Account account)
   {
	   this.account =account;
   }
   
   public void run()
   {
	   String name=Thread.currentThread().getName();
	   System.out.println(name);
	   
	   for(int i=0;i<10000;i++)
	   {
		   account.change();
	   }
   }
}
