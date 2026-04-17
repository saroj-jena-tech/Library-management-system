package com.project;

public class User {

	private String userName;
	private Book[] borrowedBooks;
	private int borrowedCount;
	public User(String user) {
		this.userName = user;
		this.borrowedBooks = new Book[5];
		borrowedCount = 0;
	}
	
	public void borrowBook(Book book) {
		if(borrowedCount == borrowedBooks.length) {
			System.out.println("Borrowed limit reached");
			return;
		}
		if(book.borrowBook()) {
			borrowedBooks[borrowedCount] = book;
			borrowedCount++;
			
			System.out.println(userName + " Book borrowed successfully");
		
		}
		else {
			System.out.println("No copies available");
		}
	}
	
	public void returnBook(Book book) {
		for(int i = 0; i < borrowedCount; i++ ) {
		
		if(borrowedBooks[i] == book) {
			
			book.returnBook();
			
			for(int j = i; j < borrowedCount - 1; j++) {
				borrowedBooks[j] = borrowedBooks[j + 1];
			}
			
			borrowedBooks[borrowedCount - 1] = null;
			borrowedCount--;
			
			System.out.println(userName + " Book returned successfully");
			return;
			}
		}
		System.out.println("Book not found in borrowed list");
	}
	
	public void displayBorrowedBooks() {
		if(borrowedCount == 0) {
			System.out.println("No books borrowed");
			return;
		}
		
		for(int i = 0; i < borrowedCount; i++) {
			borrowedBooks[i].displayDetails();
		}
	}
	
	public String getUserName() {
		return userName;
	}
}
