//package com.Array.forEach;

//import java.util.Arrays;
//import java.util.Set;
//import java.util.stream.Collectors;

//public class Arraysc 
//{
//	public static void main(String[] args) 
//	{
//		
//		int [] arr= {2,5,79,5,4,3,14};
//		
//		Set<Integer> s=Arrays.stream(arr).filter((e)->{return e>5;}).boxed().collect(Collectors.toSet());
//		System.out.println(s);
//		
//	}
//
//}



package com.Array.forEach;

import java.util.Arrays;

public class Arraysc {

    public static void main(String[] args) {
        
        int[] arr = {2, 5, 79, 5, 4, 3, 14};
        
        // Error Fix: .toArray() lagana zaroori hai Stream ko wapas array banane ke liye
        int[] d = Arrays.stream(arr)
                        .filter(s -> s > 5) 
                        .toArray();
        
        System.out.println(Arrays.toString(d));
    }
}