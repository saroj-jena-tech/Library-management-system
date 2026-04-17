package com.project;

public class FictionBook extends Book{

	private String genre;

	public FictionBook(String title, String author, int copies, String genre) {
		super(title, author, copies);
		this.genre = genre;
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Genre: " + genre);
	}

}
