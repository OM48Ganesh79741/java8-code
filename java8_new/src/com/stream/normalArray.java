package com.stream;

import java.util.Arrays;

public class normalArray {
public static void main(String[] args)
{ 
	int[] arr = {10, 20, 30, 40};

	// Array ko Stream me convert karna
	Arrays.stream(arr)
	      .forEach(element -> System.out.println(element));

	
}
}
