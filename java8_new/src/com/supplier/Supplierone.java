package com.supplier;

import java.util.function.Supplier;

public class Supplierone 
{
	public static void main(String[] args) 
	{
		Supplier<String> sup=new Supplier<String>() 
		{
		
				
			          public String  get()
			          {
						return "heelo"; 
			        	  
			          }
			          
			
			
          };
      	System.out.println(sup.get());
	}

}
