package com.practicess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//public class map {
//	public static void main(String[] args) 
//	{
//
//		int arr[] = {10, 25, 5, 40, 15};
//
//		int max = Arrays.stream(arr).max().getAsInt();
//
//		System.out.println("Max value: " + max);
//		
//
//}}





public class map {
	public static void main(String[] args) 
	{

		int arr[] = {3};

		int max = Arrays.stream(arr).max().orElse(0); // 💥 Error
		System.out.println(max);
		

}}