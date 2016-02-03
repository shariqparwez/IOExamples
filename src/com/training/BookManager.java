package com.training;

import java.io.*;

public class BookManager {
	public String addBooks(Book[] bks) throws IOException
	{
		PrintWriter out = new PrintWriter(new FileWriter("Books.txt"));
		for(Book bk:bks)
		{
			out.println(bk);
		}
		
		out.close();
		return "Books were successfully added";
	}
	
	public void printBooks(){
		try {
			FileReader fr = new FileReader("Books.txt");
			BufferedReader br = new BufferedReader(fr);
			String line=null;
			try 
			{
				while(( line=br.readLine()) !=null) {
				System.out.println(line); }
			} 
			catch (IOException e) {
			e.printStackTrace();
			} 
			} 
			catch (FileNotFoundException e) {
			e.printStackTrace(); 
			}
	}
}
