package com.twoargs;

public class Twoargs {
 

	public static void main(String[] args)
	{
		Greeting g=(a,b)->{System.out.println("sum of : "+a+b);
		
		};g.sayhello(1,5);
	}

}
@FunctionalInterface
interface Greeting{
	void sayhello(int a,int b);
}

