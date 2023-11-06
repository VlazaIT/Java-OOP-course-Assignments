// Module 2.3. Task 1-6

package Module2.TaskSet3;

public class LibraryMain {
    public static void main(String[] args) {
        Library library1 = new Library();

        library1.addBook(new Book("History of 20th Century", "John Wilson", 1996));
        library1.addBook(new Book("Funny Stuff", "Eddie Murphy", 1998));
        library1.addBook(new Book("Robinson Crusoe", "Daniel Defoe", 1719));
        library1.addBook(new Book("History of 19th Century", "John Wilson", 2000));

        library1.displayBooks();
        System.out.print("\n");

        library1.findBooksByAuthor("John Wilson");
        library1.findBooksByAuthor("John Willlllson");

        // Add a user to the library
        library1.addUser("Alice", 30);

        library1.borrowBook("Funny Stuff", "Alice");

        System.out.print("\n");
        library1.displayBooks();

        System.out.print("\n");

        library1.returnBook("Funny Stuff", "Alice");

        library1.isBookAvailable("Robinson Crusoe");

        Book robinsonCrusoe = library1.findBookByTitle("Robinson Crusoe");
        robinsonCrusoe.setRating(4.5);
        robinsonCrusoe.addReview("An inspiring tale of adventure and survival.");
        robinsonCrusoe.addReview("Timeless classic that is a must-read for any age.");

        robinsonCrusoe.printBookDetails();

        System.out.print("\n");

        library1.printAverageBookRating();
        library1.printMostReviewedBook();



    }
}
