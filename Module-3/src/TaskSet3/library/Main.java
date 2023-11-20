package TaskSet3.library;

import TaskSet3.library.system.Library;
import TaskSet3.library.model.Book;
import TaskSet3.library.model.LibraryMember;

public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();

        Book book1 = new Book("1984", "George Orwell", "123456789");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "987654321");

        // Add books to Library
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);

        // Create LibraryMember instances
        LibraryMember member1 = new LibraryMember("Alice", 1);
        LibraryMember member2 = new LibraryMember("Bob", 2);

        // Add members to Library
        myLibrary.addMember(member1);
        myLibrary.addMember(member2);

        // Borrow a book
        myLibrary.borrowBook(member1, book1);
        System.out.println("Member " + member1.getMemberId() + " borrowed: " + book1.getTitle());

        // Return a book
        myLibrary.returnBook(member2, book2);
        System.out.println("Member " + member2.getMemberId() + " returned: " + book2.getTitle());

    }


}
