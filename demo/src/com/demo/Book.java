package com.demo;

public class Book {
	int bookid;
	String title;
	String author;
	double price;
	double fin;

	void book() {
		bookid = 123;
		title = "java";
		author = "vcube";
		price = 200;
		fin = price - 0.010 * price;

		System.out.println("BookID:" + bookid);
		System.out.println("Title:" + title);
		System.out.println("Author:" + author);
		System.out.println("Original Price :" + price);
		System.out.println("Final Price:" + fin);

	}

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.book();

	}

}
