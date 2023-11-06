// Module 2.3. Task 1-6

package Module2.TaskSet3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private Map<String, User> users = new HashMap<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", author: " + book.getAuthor() + ", publication year: " + book.getPublicationYear());
        }
    }

    public void findBooksByAuthor(String author) {
        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Books found written by: " + book.getAuthor() + ". Title: " + book.getTitle() + ", Year: " + book.getPublicationYear());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found written by " + author);
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void borrowBook(String title, String userName) {
        User user = users.get(userName);
        if (user == null) {
            System.out.println("User does not exist: " + userName);
            return;
        }

        Book bookToBorrow = null;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                bookToBorrow = books.remove(i); // Remove the book from the library
                break;
            }
        }

        if (bookToBorrow != null) {
            user.borrowBook(bookToBorrow); // User class handles adding the book to its borrowed list
            System.out.println(userName + " has borrowed the book: " + title);
        } else {
            System.out.println("No books found with the following title: " + title);
        }
    }


    public void returnBook(String title, String userName) {
        User user = users.get(userName);
        if (user == null) {
            System.out.println("User does not exist: " + userName);
            return;
        }

        Book returnedBook = user.returnBook(title);
        if (returnedBook != null) {
            books.add(returnedBook); // Add the book back to the library's collection
            System.out.println(userName + " has returned the book: " + title);
        } else {
            System.out.println(userName + " did not borrow the book titled: " + title + " or the book does not exist.");
        }
    }

    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println("The book " + title + " is available.");
                return true;
            }
        }
        System.out.println("The book " + title + " is not available.");
        return false;
    }

    public void printAverageBookRating() {
        if (books.isEmpty()) {
            System.out.println("No books in the library to calculate an average rating.");
            return;
        }

        double totalRating = 0.0;
        for (Book book : books) {
            totalRating += book.getRating();
        }
        double averageRating = totalRating / books.size();
        System.out.printf("The average book rating is: %.2f%n", averageRating);
    }

    public void printMostReviewedBook() {
        if (books.isEmpty()) {
            System.out.println("No books in the library to determine the most reviewed one.");
            return;
        }

        Book mostReviewedBook = null;
        int maxReviews = 0;

        for (Book book : books) {
            int reviewCount = book.getReviews().size();
            if (reviewCount > maxReviews) {
                mostReviewedBook = book;
                maxReviews = reviewCount;
            }
        }

        if (mostReviewedBook != null) {
            System.out.println("The most reviewed book is: " + mostReviewedBook.getTitle() + ". It has " + maxReviews + " reviews.");
        } else {
            System.out.println("No reviews found for any book.");
        }
    }

    public void addUser(String name, int age) {
        if (!users.containsKey(name)) {
            users.put(name, new User(name, age));
            System.out.println("User added: " + name + ", Age: " + age);
        } else {
            System.out.println("User " + name + " already exists.");
        }
    }

}

