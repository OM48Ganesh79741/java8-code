package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Map 
{
	public static void main(String[] args) 
	{
//		int arr[]= {1,2,3,4,5,6};
//	
//		IntStream a=Arrays.stream(arr);
//		
//		IntStream  k=a.filter((x)->
//		{
//			return x%2==0;
//		}
//		);
//		k.forEach(o-> System.out.println(o));
		
		
//		***********  All code in one line **********
		
//		int arr[]= {1,2,3,4,5,6};
//		Arrays.stream(arr).filter(t->t%2==0).forEach(s->System.out.println(s));
//	
	
		
		
//		*********************** non primitive data types *********
//		Integer arr[]= {1,2,3,4,5,6};
//		
//			Stream<Integer> a=Arrays.stream(arr);
//			
//			  Stream<Integer> s= a.map((x)->
//			{
//				return x*2;
//			}
//			);
//			s.forEach(o-> System.out.println(o));
		  
		
//		*******one line me solve above
		
//		Integer arr[]= {1,2,3,4,5,6};
//		
//		Stream<Integer> a=Arrays.stream(arr).map(t->t*2);
//		a.forEach(f->System.out.println(f));
//	

//	***************** using collection ************
	
		 
//		List<Integer> li=new ArrayList<Integer>();
//		for(int i=0;i<10;i++)
//		{
//			li.add(i);
//		}
//	 Stream<Integer>	s=li.stream().filter(t->t%2==0);
//	 s.forEach(u->System.out.println(u));
//	
		
//		******************************* reduced************
		
//		List<Integer> li=new ArrayList<Integer>();
//		for(int i=0;i<10;i++)
//		{
//			li.add(i);
//		}
//	 int s=li.stream().reduce(0,(t,t2)->{return t+t2;});
//	 System.out.println(s);
	
//	max value using reduced
//	
//		 int arr[] = {5, 2, 9, 1, 7};
//
//	        // Using reduce to find minimum value
//	        int min = Arrays.stream(arr)
//	                        .reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);
//
//	        // Display the result
//	        System.out.println("Minimum value is: " + min);
//	        
	        
	        
	        
//	        ************************ flatMap **********************
		
//    List<String> s=new ArrayList<String>();
//    s.add("ganesh");
//    s.add("mahesh");
//    s.add("kiran");
//    s.add("dilip");
//    
//    
//    List<String> dup=s.stream().filter(t->t.endsWith("h")).collect(Collectors.toList());
//	
//	System.out.println(dup);
		
		
		
		
		
//		***********************************************************************
		
		Integer arr[]= {1,2,3,4,5};
		
		int x = Arrays.stream(arr)
		     .mapToInt(i->i)
		        .sum();

		System.out.println(x);
	}

   
}
