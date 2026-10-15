package com.practice;

import java.util.function.Function;
import java.util.function.Predicate;

public class Practice {

	public static void main(String[] args)
	{
		Function<String, Integer> func=(g)->
		{
		   return g.length();	
		};
		
		Function<String, Integer> func1=(e)->
		{
		   return null;	
		};
		
		Function<String ,Integer> gg=func.andThen(func1);
		
		gg.apply("GANESH");

	}

}
