package com.functionalInterface;

import java.util.function.Function;

public class Driver 
{
	public static void main(String[] args)
	{
		String word []= {"raju","kaj","aman","suman"};
	
//	
//            Function<String , Integer> func=new Function<String, Integer>() {
//				
//				@Override
//				public Integer apply(String t) {
//					
//					return t.length();
//				}
//			};
//			
//			
//			for(String s:word)
//			{
//			  System.out.println(func.apply(s));
//			}
		
		
		
//		using lamda expressiom  same example
		
		

        Function<String , Integer> func =(String t)-> {
				
				return t.length();
			};
		
		
		
		for(String s:word)
		{
		  System.out.println(func.apply(s));
		}
	}

}
