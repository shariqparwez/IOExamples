package com.training;

import java.io.IOException;

public class BookReadWriteApplication {
	public static void main(String[] args){
		Book[] book = new Book[3];
		book[0] = new Book(100,"Java","Gosling", 495.00);
		book[1] = new Book(100,"Python","Richardson", 295.00);
		book[2] = new Book(100,"C","Kanetkar", 195.00);
		
		BookManager bookManager = new BookManager();
		try {
			System.out.println(bookManager.addBooks(book));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		bookManager.printBooks();
	}
}
