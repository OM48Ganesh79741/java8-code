package com.practice;

public class Launch
{
   public static void main(String[] args) 
   {
	  Cart send=new Cart();
	  send.setName("send");
	  
	  Cart recive=new Cart();
	  recive.setName("recive");
	  
	  send.start();
	  recive.start();
	  
	  
   }
}
