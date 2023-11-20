package TaskSet3.library.model;

import java.util.*;

public class LibraryMember {
    private String name;
    private int memberId;
    private final List<Book> booksBorrowed;
    private final List<Book> reservedBooks = new ArrayList<>();

    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        this.booksBorrowed = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId){
        this.memberId = memberId;
    }

    public List<Book> getBooksBorrowed() {
        return booksBorrowed;
    }

    public void borrowBook(Book book) {
        this.booksBorrowed.add(book);
    }

    public void returnBook(Book book) {
        this.booksBorrowed.remove(book);
    }

    public void addReservedBook(Book book) {
        reservedBooks.add(book);
    }

    public void removeReservedBook(Book book) {
        reservedBooks.remove(book);
    }

    public List<Book> getReservedBooks() {
        return reservedBooks;
    }

}
