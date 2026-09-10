# 📚 Library Management System

A console-based **Library Management System** built using **Core Java and Object-Oriented Programming (OOP)** concepts.

The application allows users to manage books, search for books, borrow and return books, and handle different types of books such as Fiction and Non-Fiction.

## 🚀 Features

* 📖 Add Fiction and Non-Fiction books
* 📚 Display all available books
* 🔍 Search books by title
* 📥 Borrow books
* 📤 Return borrowed books
* 👤 User management
* 📊 Track available book copies
* 🔒 Limit users to a maximum of 5 borrowed books
* ⚠️ Handle unavailable books and invalid operations
* 🖥️ Simple menu-driven console interface

## 🛠️ Tech Stack

* **Java**
* **Core Java**
* **Object-Oriented Programming (OOP)**
* **Java Collections & Arrays**
* **Scanner for user input**

## 🧠 OOP Concepts Demonstrated

### Encapsulation

Private fields are used in classes such as `Book`, `User`, and their subclasses, with appropriate methods for accessing data.

### Inheritance

`FictionBook` and `NonFictionBook` extend the common `Book` class.

```text
Book
├── FictionBook
└── NonFictionBook
```

### Polymorphism

The application uses `Book` references to work with different book types.

### Method Overriding

`FictionBook` and `NonFictionBook` override the `displayDetails()` method to display their additional information.

### Constructor Chaining

Child classes use `super()` to initialize the common properties defined in the parent `Book` class.

## 📂 Project Structure

```text
Library-management-system/
│
├── src/
│   ├── com/
│   │   └── project/
│   │       ├── Book.java
│   │       ├── FictionBook.java
│   │       ├── NonFictionBook.java
│   │       ├── Library.java
│   │       ├── User.java
│   │       └── Main.java
│   │
│   └── module-info.java
│
└── README.md
```

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/saroj-jena-tech/Library-management-system.git
```

### 2. Open the project

Open the project in an IDE such as **Eclipse** or **IntelliJ IDEA**.

### 3. Run the application

Run:

```text
Main.java
```

The application will start with a menu similar to:

```text
----Library Management System----
1. Add Books
2. Display All Books
3. Search Book
4. Borrow Book
5. Return Book
6. Exit
```

## 💡 Example Workflow

1. Enter the user's name.
2. Add a Fiction or Non-Fiction book.
3. View all available books.
4. Search for a book by title.
5. Borrow an available book.
6. Return the borrowed book when finished.

## 🎯 Learning Objectives

This project was developed to practice:

* Java classes and objects
* Encapsulation
* Inheritance
* Polymorphism
* Method overriding
* Constructors
* Arrays
* Conditional statements
* Loops
* Exception-safe input flow
* Basic application design

## 👨‍💻 Author

**Saroj Jena**

Java Backend Developer

* GitHub: https://github.com/saroj-jena-tech
* LinkedIn: https://www.linkedin.com/in/saroj-jena-java/
