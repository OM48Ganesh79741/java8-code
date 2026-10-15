package com.functionpassRetun;

public class Employee 
{
  public Car test()
  {
	  Car c=(a, b)->{
		  System.out.println(a+b);
	  };
	
	  return c;
  }
  public void abc(Car func)
  {
	  func.add(11,9);
  }
}
