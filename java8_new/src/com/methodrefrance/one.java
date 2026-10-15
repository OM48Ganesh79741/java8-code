
package com.methodrefrance;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

//public class one 
//{
//  public static void main(String[] args) 
//  {
//	  1 .using lamda 
	  
//	 Function<String , Integer> fun=(str)->  str.length();
//	 System.out.println(fun.apply("ramesh"));
	  
	  
//	  static method by method refrance
	  
//	  Function<String , Integer> fun=  String::length;
//	  System.out.println(fun.apply("ramesh"));
	


//3.******************************************
//class one 
//{
//	public static void main(String[] args) 
//	{
//		
//		 ganesh g=new ganesh();
//		String b= g.rstring("pagacer");
//		System.out.println(b);
//	}
//}
//class ganesh
//{
//	public String rstring( String name)
//	{
//		char ch='e';
//		
//		String newstr="";
//		
//		int i=0;
//		
//         while(i<name.length())
//		{
//	        
//			char dup=name.charAt(i);
//			if(dup!='e')
//			{
//				newstr=newstr+dup;
//				
//			}
//			else
//			{
//				continue;
//			}
//			System.out.println("heeee");
//		
//			
//				i++;
//			
//			
//			 
//		}
//		
//		
//		return newstr;
//	}
//}











		 
	//2.concat data
	  
//	  String name="ganesh";
//	  Function<String , String> str=(a)->a.concat(name);
//	 System.out.println( str.apply("pagar"));
//	 
	 
	 //method Rwefrance
//	 String name="ganesh";
//	 Function<String , String> str=name::concat;
//	 System.out.println( str.apply("pagar"));
//	
//  }
//}

//	  

//isme ek hi calue leta hai aur deta hai to no need to write this
//	 nonstatic method   with method refrance  (single method
//	 
//	 import java.util.function.Function;
//
//	 public class one 
//	 {
//
//	   
//	     public String addHello(String name) 
//	     {
//	         return "Hello " + name;
//	     }
//
//	     public static void main(String[] args) 
//	     {
//	         one obj = new one();
//
//	        
//	         Function<String, String> func = obj::addHello;
//  
//
//	        
//	         String result = func.apply("Ganesh");
//	         System.out.println(result); // Output: Hello Ganesh
//	     }
//	 }





//
//import java.util.function.Function;

//public class one 
//{
//
//  
//    public String addHello(String name) 
//    {
//        return "Hello " + name;
//    }
//
//    public static void main(String[] args) 
//    {
//        one obj = new one();
//
//       
//        Function<String, String> func =new Function<String, String>() 
//        {
//
//			@Override
//			public String apply(String t) {
//				
//				return obj.addHello(t);
//			}
//		};
//
//
//       
//        String result = func.apply("Ganesh");
//        System.out.println(result); // Output: Hello Ganesh
//    }
//}



//	*****************************************************
	

//3.  with two mwrthos

//import java.util.function.Function;
//
//public class one {
//
//    public String greet(String name) {
//        return "Hello " + name;
//    }
//
//    public String farewell(String name) {
//        return "Goodbye " + name;
//    }
//
//    public static void main(String[] args) {
//        one obj = new one();
//
//        // Method reference to greet
//        Function<String, String> func = obj::greet;
//
//        System.out.println(func.apply("Ganesh")); // Output: Hello Ganesh
//    }
//}



//*********************************************

		 
//bipredicate accept two value  return boolean value

//check two String equal are nor

//1. without method refrance 

//class one
//{
//	public static void main(String[] args)
//	{
//		
//	    BiPredicate<String, String> bi=(string1,string2)->
//	    		{
//	    	      return  string1.equalsIgnoreCase(string2);
//	    		};
//	    		
//	    System.out.println(bi.test("ganesh","ramesh"));
//		
//	}
//}
  


//  method refrance is posible for only interfaces
//  method ke sath nahi use ho sakta  apna khsud ka interface nbanana hoga
//  2.with method refrance

//class one
//{
//	public static void main(String[] args)
//	{
////	    it automatically detect how value come and give only class name	
//	    BiPredicate<String, String> bi=  String::equalsIgnoreCase;
//	
//	    		
//	    System.out.println(bi.test("ganesh","ramesh"));
//		
//	}
//}



//********************************************************



//✅ Step 1: Custom Functional Interface
//interface MyCheckInterface 
//{
// boolean check(String a, String b);  // abstract method
//}
//
//public class one 
//{
//
//
// public boolean compareIgnoreCase(String s1, String s2)
// {
//     return s1.equalsIgnoreCase(s2);
// }
//
//// functional interface no need to implemnts
// public static void main(String[] args) 
// {
//     one obj = new one();
//
//    
//     MyCheckInterface myCheck = obj::compareIgnoreCase;
//
//     
//     boolean result = myCheck.check("ganesh", "GANESH");
//     System.out.println(result); 
// }
//}



//***************************************************

            //REFRANCE TO A CONSTRUCTOR
//
// class one 
// {
//	 public static void main(String[] args) 
//	 {
//		 Supplier<List<String>> sb1= ArrayList::new;
////		List<String> list1=sb1.get();
//		System.out.println(sb1.getClass());
//		
//		
//		Supplier<List<String>> sb2=()->new ArrayList<>();
////		List<String> list2=sb2.get();
//		System.out.println(sb2.getClass());
//	          
//	}
// }
////
////2. constructor 
// 
// import java.util.ArrayList;
// import java.util.List;
// import java.util.function.Supplier;
//
// public class one {
//     public static void main(String[] args) {
//         // Supplier that supplies a new ArrayList<String>
//         Supplier<List<String>> sb1 = ArrayList::new;
//
//         // Getting a new list instance from the supplier
//         List<String> list1 = sb1.get();
//
//         // Adding values to the list
//         list1.add("Apple");
//         list1.add("Banana");
//         list1.add("Cherry");
//
//         // Printing the list
//         System.out.println("List: " + list1);
//
//         // Printing the class of the supplier
//         System.out.println("Supplier class: " + sb1.getClass());
//     }
// }





//3 method


import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class one {

    public static void main(String[] args)
    {
        // Method call
        List<String> list = createList();

        // Print the list
        System.out.println("List: " + list);
    }

    // Method using ArrayList::new and returning list
    public static List<String> createList() {
        // Method reference to create new ArrayList
        Supplier<List<String>> supplier = ArrayList::new;

        // Create list using supplier
        List<String> list = supplier.get();

        // Add values to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Return the list
        return list;
    }
}



















