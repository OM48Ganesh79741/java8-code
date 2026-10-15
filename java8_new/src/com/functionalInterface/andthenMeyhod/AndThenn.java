package com.functionalInterface.andthenMeyhod;

import java.util.function.Function;

public class AndThenn 
{
  public static void main(String[] args) 
  {
	 Function<String , String> func=(s)->{
		                   return s;
				 };
				 
				func= func.andThen(ss->{return ss+" pagar";});
				System.out.println(func);
				 
	System.out.println("jjjjjjj"+ func.apply("ganesh"));
  }
}
