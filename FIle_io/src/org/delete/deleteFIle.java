package org.delete;

import java.io.File;

public class deleteFIle {

	public static void main(String[] args) {

        File f = new File("D:/demo.txt");

        if (f.delete()) {
            System.out.println("File Deleted");
        } else {
            System.out.println("File Not Found");
        }
    }
	
}
