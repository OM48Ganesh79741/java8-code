package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StremApi2 
{
	
   public static void main(String[] args)
   {
//	 List<Integer> list=Arrays.asList(1,2,3,4,5,6);
//   
// 
//	 Stream<Integer> list1=list.stream();
//	 
//	Function<Integer, Integer> fun=new Function<Integer,Integer>() 
//	{
//		
//		@Override
//		public Integer apply(Integer t) 
//		{
//		   return t*3;
//		}
//	};
//			
//			//created new stream
//			Stream ss=list1.map(fun); //list1 ki 11 value function me  ja rahi hai
//	
//			ss.forEach(n->{System.out.println(n);});
	 

  // ********************************
////	uper wala short likha hai
	   List<Integer> list=Arrays.asList(1,2,3,4,5,6,7);
	   
	 Stream<Integer> list1=list.stream();
	 
	 //list me store karne ke liye collectors use karna padta hai
     //	 by default map method return stream
	 // stram hamne yaha pr use ki hai(list1) ab kam dobara use karenge to erroe aayega
			
	 Stream<Integer> map=list1.map(t->{ return t*3;});
   
//	 agr hamne yaha pr iterate bhi ki rto wo use nahi kr sakte
//	  map.forEach(i->{System.out.println(i);});
//	  
	  
////			oprte filter uper ka map foreach mat likho varna nahi chalegi
	 Stream<Integer> fil=map.filter((f)->{return f%2==0;});
//			
//	
//	 
//	 
////	 sum
//	 
	Integer reduce= fil.reduce(0,(a,c)->{return a+c;});
    System.out.println(reduce);
//	 
//	 
//	 
////	 use nahi kr sakte uper use hai
////	       map.forEach(i->{System.out.println(i);});
//			list.forEach(i->{System.out.println(i);});
//			
////			use hui hai ab error aayega
////			list1.forEach(i->{System.out.println(i);});
//			*************************************************

			
//			******uper wala code in one  line
			
//			uper wala short likha hai
	   
	   
//			   List<Integer> list=Arrays.asList(1,2,3,4,5,6,7);
//			   
//			 Integer reduce=list.stream().map(t->{ return t*3;}).filter((f)->{return f%2==0;}).reduce(0,(a,c)->{return a+c;});
//
//			System.out.println(reduce);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
//			*******************************************
//	   store data in List using collectors
//			 List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//
//		        List<Integer> newList = list.stream()
//		                                    .map(t -> t * 3)
//		                                    .collect(Collectors.toList());
//
//		        System.out.println(newList);  // Output: [3, 6, 9, 12, 15, 18, 21]
//   
//   
   }
}
