package TaskSet3.library.model;

import java.util.*;

public class LibraryMember {
    private String name;
    private int memberId;
    private List<Book> booksBorrowed;

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


}
