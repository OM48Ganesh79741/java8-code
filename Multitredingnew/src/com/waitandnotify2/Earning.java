package com.waitandnotify2;

public class Earning  extends Thread
{
  int total;
  totalEarning t;
  public Earning(totalEarning t)
  {
	  this.t=t;
  }
  
  public void run()
  {
	 t.totalEarning();
  }


	

  
}
