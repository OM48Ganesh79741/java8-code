package com.tresd;

public class Treads 
{
 public static void main(String[] args)
 {
	 FIve f=new FIve();
//	 f.start();
	 
	 Seven s=new Seven();
	 f.run();

	 s.start();
	 System.out.println(s.getPriority());
}
}
