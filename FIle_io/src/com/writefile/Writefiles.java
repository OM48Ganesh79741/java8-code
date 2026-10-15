package com.writefile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writefiles 
{
	public static void main(String[] args) throws IOException
	   {
	       File f = new File("D:\\file_io\\ganesh.txt");

	       if (f.createNewFile()) 
	       {
	           System.out.println("File created");
	       }

	       FileWriter fw = new FileWriter(f);
	       fw.write("hello ganesh");
	       fw.close();

	       System.out.println("Data written");
	   }
}
