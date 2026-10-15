package com.nethodpassrefrance;

import java.util.function.Function;

//import java.util.function.BiFunction;
//
//public class Mrthodrefrance 
//{
//  public static void main(String[] args) 
//  {
//	 suresh s=new suresh();
//	 BiFunction<String,Integer,String > ref=s::hello;
//    String res= ref.apply("rahul",22);
//    System.out.println(res);
//  }
//}
//
//class suresh
//{
//	public String hello(String name,int id)
//	{
//		return name+id;
//	}
//}
//

//***********************************************
public class Mrthodrefrance 
{
  public static void main(String[] args) 
  {
	 suresh s=new suresh();
	 Function<String,Integer > ref=s::hello;
    int res= ref.apply("rahul");
    System.out.println(res);
  }
}

class suresh
{
	public int hello(String name)
	{
		return name.length();
	}
}
