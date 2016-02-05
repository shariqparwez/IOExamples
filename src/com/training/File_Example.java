package com.training;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class File_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("Sample.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PrintWriter writer;
		
		try {
			writer = new PrintWriter(f);
			writer.println("Hello");
			writer.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(f.exists());
		
		//File dir = new File(".");
		
	}

}
