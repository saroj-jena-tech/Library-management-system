package com.project;
import java.util.Scanner;
public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			Library library = new Library();

			System.out.print("Enter your name: ");
			String name  = sc.nextLine();
			User user = new User(name);

			while(true) {
				System.out.println("----Library Management System----");
				System.out.println("1. Add Books");
				System.out.println("2. Display All Books");
				System.out.println("3. Search Book");
				System.out.println("4. Borrow Book");
				System.out.println("5. Return Book");
				System.out.println("6. Exit");
				System.out.print("Enter your choice: ");
//				System.out.println();

				int choice = sc.nextInt();
				sc.nextLine();

				switch(choice) {

				case 1:
					System.out.println("1. Fiction Book");
					System.out.println("2. Non Fiction Book");
					System.out.print("Enter book type: ");
					int type = sc.nextInt();
					sc.nextLine();

					System.out.print("Enter title: ");
					String title = sc.nextLine();

					System.out.print("Enter author: ");
					String author = sc.nextLine();

					System.out.print("Enter number of copies: ");
					int copies = sc.nextInt();
					sc.nextLine();

					if(type == 1) {
						System.out.print("Enter genre: ");
						String genre = sc.nextLine();

						Book book = new FictionBook(title, author, copies, genre);
						library.addBook(book);
						
						System.out.println("Book added successfully");
					}
					else if(type == 2) {
						System.out.print("Enter Subject: ");
						String subject = sc.nextLine();

						Book book = new NonFictionBook(title, author, copies, subject);
						library.addBook(book);
						
						System.out.println("Book added successfully");
					}
					break;

				case 2:
					library.displayAllBooks();
					break;

				case 3:
					System.out.print("Enter book title: ");
					String searchTitle = sc.nextLine();

					Book foundBook = library.searchBook(searchTitle);

					if(foundBook != null) {
						foundBook.displayDetails();
					}
					else {
						System.out.println("Book not found");
					}

					break;

				case 4:
					System.out.print("Enter book title to borrow: ");
					String borrowTitle = sc.nextLine();

					Book borrowBook = library.searchBook(borrowTitle);

					if(borrowBook != null) {
						user.borrowBook(borrowBook);
					}
					else {
						System.out.println("Book not found");
					}

					break;

				case 5:
					System.out.print("Enter book title to return: ");
					String returnTitle = sc.nextLine();

					Book returnBook = library.searchBook(returnTitle);

					if(returnBook != null) {
						user.returnBook(returnBook);
					}
					else {
						System.out.println("Book not found");
					}
					break;

				case 6:
					System.out.println("Exited from system");
					sc.close();
					return;

				default:
					System.out.println("Invalid choice");
				}

			}	
		}	
		
	}
