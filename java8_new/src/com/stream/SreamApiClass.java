package com.stream;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class SreamApiClass 
{
	public static void main(String[] args) 
	{
		 ArrayList<Integer> al=new ArrayList<Integer>();
	            al.add(10);
	            al.add(20);
	            al.add(30);
	            al.add(50);
	            al.add(11);
	            
	            
	            //Stream createtd 
	            Stream<Integer> ss=al.stream();
	           
//	            Stream Consumer
	           Stream<Integer> f= ss.filter((c)->{
	            	return c%2==0;
	            });
	            
	            f.forEach((t)->{System.out.println(t);});
	            
//	            original jaisa hai vaisa hi rahta hai dublicate pe operation perform hota hai
//	            stream use hui to  ha us par iperation perform nahi  kr sakte becauese uski memory destroy ho jati hai
	            
//	            Stream<Integer> filter =ss.map(n->n*2);
	            
	            
//	           Stream<Integer>sr= f.map((m)->{
//	            	 System.out.println(m);
//	            });
	            
	            


		
	}

}
