package com.functionalInterface.compose;

import java.util.function.Function;

public class Conpose 
{
  public static void main(String[] args)
  {
	 Function<String , String> func=(s)->{return s+" Pagar"; };
	 
	 Function<String , String> second=(ss)-> {return ss;};
	 
	second= func.compose(second);
	System.out.println(second.apply("ganeshh"));
	 
  }
}
