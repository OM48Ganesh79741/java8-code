package com.functonal;

public class FunctinalTwoArgs 
{
	public static void main(String[] args)
	{
		Greeting g=()->{System.out.println("hello everyone");
		
		};g.sayhello();
	}

}
@FunctionalInterface
interface Greeting{
	void sayhello();
}

