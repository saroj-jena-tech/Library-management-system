package com.project;
public class NonFictionBook extends Book {
private String subject;

	public NonFictionBook(String title, String author, int copies, String subject) {
		super(title, author, copies);
		this.subject = subject;
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Subject: "+ subject);
	}
}
