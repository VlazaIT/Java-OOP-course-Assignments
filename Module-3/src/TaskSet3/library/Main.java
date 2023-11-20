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

        // Member 1 borrows "1984"
        myLibrary.borrowBook(member1, book1);
        System.out.println("Member " + member1.getMemberId() + " borrowed: " + book1.getTitle());

        // Member 2 tries to reserve "1984" but should fail as it's borrowed
        myLibrary.reserveBook(member2, book1);
        System.out.println("Member " + member2.getMemberId() + " tried to reserve: " + book1.getTitle());

        // Member 1 returns "1984"
        myLibrary.returnBook(member1, book1);
        System.out.println("Member " + member1.getMemberId() + " returned: " + book1.getTitle());

        // Member 1 or Member 2 now can successfully reserve "1984"
        myLibrary.reserveBook(member1, book1);
        System.out.println("Member " + member1.getMemberId() + " reserved: " + book1.getTitle());

        // Display reserved books for Member 1
        myLibrary.displayReservedBooks(member1);

        // Member 1 cancels the reservation
        myLibrary.cancelReservation(member1, book1);
        System.out.println("Member " + member1.getMemberId() + " cancelled the reservation for: " + book1.getTitle());

        // Display reserved books for Member 1 to confirm cancellation
        myLibrary.displayReservedBooks(member1);
    }


}
