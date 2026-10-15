package com.syncronizationAlternativw;

public class User extends Thread
{
	private Resource resource;
	
	public User(Resource r)
	{
		resource=r;
	}
   @Override
   public void run()
   {
	   String name=Thread.currentThread().getName();
	   resource.printer(name);
   }
}
