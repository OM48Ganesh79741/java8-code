package com.practice;

public class Cart extends Thread
{		Cart cart = new Cart();
	
	public boolean hasItem=false;
	private int item=0;
	
    @Override
    public  void run()
    {
    	if(Thread.currentThread().getName()=="reciver")
    	for(int i=0;i<10;i++)
    	{
    		consume(i,Thread.currentThread().getName());
    		try {
				Thread.sleep(2000);
			} catch (InterruptedException e)
    		{
				
				e.printStackTrace();
			}
    	}
    	else
    	{
    	   for(int i=0;i<10;i++)
    	    {
    		   send(i,Thread.currentThread().getName());
    		   try {
   				Thread.sleep(2000);
   			} catch (InterruptedException e)
    		   {
   				
   				e.printStackTrace();
   			}
    	    }
    	}
    	
    }
    
    public synchronized void consume(int i,String name)
    {
    	

    	while(!hasItem)
    	{
    		try {
		
				cart.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	
    	System.out.println("consume: "+i+": "+ name);
    
    }
    
    public synchronized void send(int i,String name)
    {
    	
    	while(hasItem)
    	{
    		try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	System.out.println("zend"+i+" : "+name);
    	hasItem=false;
    	
    }
}
