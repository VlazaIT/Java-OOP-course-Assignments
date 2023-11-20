package TaskSet3.library.system;

import TaskSet3.library.model.Book;
import TaskSet3.library.model.LibraryMember;
import java.util.*;

public class Library {
    private List<Book> books;
    private List<LibraryMember> members;

    public Library(){
        books = new ArrayList<Book>();
        members = new ArrayList<LibraryMember>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(LibraryMember member) {
        members.add(member);
    }

    public void borrowBook(LibraryMember member, Book book) {
        if (books.contains(book)) {
            member.borrowBook(book);
            books.remove(book);
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        if (member.getBooksBorrowed().contains(book)) {
            member.returnBook(book);
            books.add(book);
        }
    }

    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved() && isBookAvailable(book)) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is already reserved or not available.");
        }
    }

    // Helper method to check if a book is available
    private boolean isBookAvailable(Book book) {
        return books.contains(book);
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (member.getReservedBooks().contains(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("Reservation canceled successfully.");
        } else {
            System.out.println("No reservation found for this book by this member.");
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getName() + ":");
        for (Book reservedBook : member.getReservedBooks()) {
            System.out.println(reservedBook.getTitle());
        }
    }

}
