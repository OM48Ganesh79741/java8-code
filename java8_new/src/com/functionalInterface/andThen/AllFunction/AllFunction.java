package com.functionalInterface.andThen.AllFunction;

import java.util.function.Function;

public class AllFunction 
{
	


	    public static void main(String[] args) {

	 
	        Function<String, String> firstFunc = (s) -> {
	            return s;
	        };

	
	        Function<String, String> secondFunc = (ss) -> {
	            return ss + " pagar";
	        };

	 
	        Function<String, String> combinedFunc  = firstFunc.andThen(secondFunc);

	     
	        System.out.println(combinedFunc.apply("ganesh"));  // Output: ganesh pagar
	    }
	

}
