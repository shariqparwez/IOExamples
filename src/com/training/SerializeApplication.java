package com.training;

public class SerializeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello");
		Book book = new Book(777,"PythonProgramming","AlanKay", 385.00);
		BookSerializer bookSerializer = new BookSerializer();
		System.out.println(bookSerializer.serialize(book));
		
		Book bk = (Book) bookSerializer.deSerialize();
		System.out.println(bk);
	}

}
