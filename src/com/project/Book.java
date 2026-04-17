package com.project;

public class Book {

	private String title;
	private String author;
	private int copies;

	public Book(String title, String author, int copies) {
		this.title = title;
		this.author = author;
		this.copies = copies;

	}

	public boolean borrowBook() {
		if(copies > 0) {
			copies--;
			return true;
		}
		else {
			return false;
		}
	}

	public void returnBook() {
		copies++;
	}

	public void displayDetails() {

		System.out.println("Title: "+ title);
		System.out.println("Author: " + author);
		System.out.println("Copies: "+ copies);
	}

	public String getTitle() {
		return title;
	}

	public int getCopies() {
		return copies ;
	}

}

