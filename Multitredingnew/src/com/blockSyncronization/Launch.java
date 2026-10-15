package com.blockSyncronization;

public class Launch
{
   public static void main(String[] args) throws InterruptedException
   {
	   Account account=new Account();
	   
	  Card c1=new Card(account );
	  Card c2=new Card(account);
	  
	  c1.setName("Card1");
	  c2.setName("Card2");
	  
	  c1.start();
	  c2.start();
	  
	    c1.join();
	    c2.join();
	    
	    account.get();
	  
   }
}
