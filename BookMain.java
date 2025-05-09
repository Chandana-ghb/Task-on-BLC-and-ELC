package com.blc.elc;

public class BookMain {

	public static void main(String[] args) {
		Book b=new Book();
		b.setBookDetails("Java Basics","John Doe",450.0);
		System.out.println(b.getBookDetails());
	}
}
