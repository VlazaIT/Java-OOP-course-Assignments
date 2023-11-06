// Module 2.3. Task 6

package Module2.TaskSet3;

import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private ArrayList<Book> borrowedBooks;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void borrowBook(Book book) {
        if (book != null) {
            borrowedBooks.add(book);
        } else {
            System.out.println("The book is not available for borrowing.");
        }
    }

    public Book returnBook(String title) {
        for (Book book : borrowedBooks) {
            if (book.getTitle().equals(title)) {
                borrowedBooks.remove(book);
                return book; // Return the book that was removed from borrowedBooks
            }
        }
        return null; // Return null if no book is found
    }

    public Book getBorrowedBook(String title) {
        for (Book book : borrowedBooks) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null; // Return null if no book is found
    }
}
