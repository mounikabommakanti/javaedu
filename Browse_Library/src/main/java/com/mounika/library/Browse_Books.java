package com.mounika.library;

import com.mounika.Texas_Inventory.Head_Library_Impl;

public class Browse_Books  {
	public static void main(String args[]) {
		Head_Library browse_books=new Head_Library_Impl();
		System.out.println(browse_books.getGenre());
		System.out.println(browse_books.getBookTitle());
		System.out.println(browse_books.getAuthor());		
		System.out.println(browse_books.getEdition());
		System.out.println(browse_books.getAvailability());
	}

}
