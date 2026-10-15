package com.createFIle;

import java.io.File;

public class FIleCreate {

	
	 public static void main(String[] args) throws Exception 
	 {

	        File f = new File("D:\file_io");

	        if (f.createNewFile()) 
	        {
	            System.out.println("File Created");
	        } else {
	            System.out.println("File Already Exists");
	        }
	    }
	
}
