package com.predict;

import java.util.function.Predicate;

public class predict1 {

	public static void main(String[] args) 
	{
		
		int arr[]={1,2,3,4,5,6};
		
		
//		Predicate<Integer> pre=new Predicate<Integer>()
//				{
//
//					@Override
//					public boolean test(Integer t) {
//						
//						return t%2==0;
//					}
//			
//				};
				
		
		
//		
//				for(Integer i:arr)
//				{
//					Boolean b=pre.test(i);
//					if(b)
//					{
//						System.out.println("true");
//					}
//					else
//					{
//						System.out.println("false");
//					}
//				}
		
		
		
		
//		lamda expression
		
		Predicate<Integer> pre=element-> element%2==0;
		

		for(Integer i:arr)
		{
			Boolean b=pre.test(i);
			if(b)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
				
		

	}

}
