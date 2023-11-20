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
}
