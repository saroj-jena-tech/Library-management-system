package com.project;

public class Library {

	private Book[] books;
	private int bookCount;

	public Library() {
		books = new Book[50];
		bookCount = 0;
	}

	public void addBook(Book book) {
		if(bookCount == books.length) {
			System.out.println("Library is full");
			return;
		}

		books[bookCount] = book;
		bookCount++;
	}
	public void displayAllBooks() {
		if(bookCount == 0) {
			System.out.println("No books available");
			return;
		}
		for(int i = 0; i < bookCount; i++) {
			books[i].displayDetails();
		}
	}

	public Book searchBook(String title) {
		if(bookCount == 0) {
			return null;
		}
		for(int i = 0; i < bookCount; i++) {
			if(books[i].getTitle().equalsIgnoreCase(title)) {
				return books[i];
			}
		}
		return null;
	}
	public int getBookCount() {
		return bookCount;
	}
}
