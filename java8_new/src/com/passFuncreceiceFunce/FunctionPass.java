//package com.passFuncreceiceFunce;
//
//
//import java.util.function.Consumer;
//import java.util.function.Function;
//
//public class FunctionPass 
//{
//  public static void main(String[] args) 
//  {
// Consumer<String> consu=(e)->{
//		      System.out.println(e.length());
//		};
//		 
//		  String arr[]= {"ganesh","mahesh","suresh"};
//		  
//		  for(String s:arr)
//		  {
//			 consu.accept(s); 
//		  }
//		  
//		  employee e =new employee();
//		  e.add(consu);
//		  
//		  int arr1[]= {1,2,3,4};
//		  
//		 Function<Integer, Character>  func=e.Functionp(arr1);
//   }
// 
//  
//  
// 
//}
//class employee
//{
//	String newarr[]= {"hello","bye","good bye"};
//	
//	
//	public void add(Consumer<String> c)
//	{
//		System.out.println("**************** employee class **********");
//		for(String i:newarr)
//		{
//			c.accept(i);
//		}
//	}
//	
//	public Function<Integer , Character> Functionp(int arr[] )
//	{
//		for(int a:arr)
//		{
//			
//		}
//		return new Function<Integer,Character>(){
//
//					@Override
//					public Character  apply(Integer t) {
//						
//					return  (char) t.intValue();
//					}
//			
//				};
//	}
//}























//
//
//package com.passFuncreceiceFunce;
//
//import java.util.function.Consumer;
//import java.util.function.Function;
//
//public class FunctionPass {
//    public static void main(String[] args) {
//    	
//        Consumer<String> consu = (e) -> 
//        {
//            System.out.println(e.length());
//        };
//
//        String arr[] = {"ganesh", "mahesh", "suresh"};
//
//        for (String s : arr) 
//        {
//            consu.accept(s);
//        }
//        
//
//        employee e = new employee();
//        e.add(consu);
//
//        int arr1[] = {65, 66, 67, 68}; // these correspond to A, B, C, D
//
//        Function<Integer, Character> func = e.Functionp();
//
//        // Apply function and print results
//        
//        System.out.println("********* Characters from int array *********");
//        for (int value : arr1) {
//            System.out.println("Integer: " + value + " -> Character: " + func.apply(value));
//        }
//       Function <Integer,Character> aa= e.acceptdta(func);
//       System.out.println("****************************************************************");
//       System.out.println(aa);
//    }
//}
//
//class employee {
//    String newarr[] = {"hello", "bye", "good bye"};
//
//    public void add(Consumer<String> c) {
//        System.out.println("**************** employee class **********");
//        for (String i : newarr) {
//            c.accept(i);
//        }
//    }
//
//    // Function that converts Integer to Character (e.g., 65 -> 'A')
//    //trtun 
//    public Function<Integer, Character> Functionp() {
//     
//
//        Function<Integer,Character> func= new Function<>() {
//            @Override
//            public Character apply(Integer t) {
//                return (char) t.intValue(); // Convert Integer to corresponding character
//            }
//        };
//        return func;
//    }
//    
//    public Function<Integer,Character> acceptdta(Function<Integer, Character> a)
//    { 
//    	int arr[]= {68,85};
//    	for(int ar:arr)
//    	{
//    		Character ch=a.apply(ar);
//    		System.out.println(ar+" : "+ch);
//    	}
//    	return a;
//    }
//    
//}




//******************************  anonymous inner class************





package com.passFuncreceiceFunce;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionPass {
    public static void main(String[] args) {
    	
        

        employee e = new employee();
       

        int arr1[] = {65, 66, 67, 68}; // these correspond to A, B, C, D

        Function<Integer, Character> func = e.Functionp();

        // Apply function and print results
        
        System.out.println("********* Characters from int array *********");
        for (int value : arr1) {
            System.out.println("Integer: " + value + " -> Character: " + func.apply(value));
        }
       Function <Integer,Character> aa= e.acceptdta(func);
       System.out.println("****************************************************************");
       System.out.println(aa);
    }
}

class employee {
   

    
    public Function<Integer, Character> Functionp() {
     
 Function<Integer,Character> func=(t)-> { 
	 
	 return (char) t.intValue(); // Convert Integer to corresponding character
           
                };
       return func;
    }
    
    public Function<Integer,Character> acceptdta(Function<Integer, Character> a)
    { 
    	int arr[]= {68,85};
    	for(int ar:arr)
    	{
    		Character ch=a.apply(ar);
    		System.out.println(ar+" : "+ch);
    	}
    	return a;
    }
    
}
