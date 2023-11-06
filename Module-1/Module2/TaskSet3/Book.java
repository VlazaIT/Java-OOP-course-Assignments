// Module 2.3. Task 1-6

package Module2.TaskSet3;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private String author;
    private int publicationYear;
    private double rating;
    private List<String> reviews;
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.reviews = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setRating(double rating) {
        this.rating = rating;
        System.out.println("Rating for '" + title + "' set to: " + rating);
    }

    public double getRating() {
        return rating;
    }

    public void addReview(String review) {
        reviews.add(review);
        System.out.println("A new review added to '" + title + "': " + review);
    }

    public List<String> getReviews() {
        return new ArrayList<>(reviews); // Return a copy of the reviews list
    }

    public void printBookDetails() {
        System.out.println("Details of the book '" + title + "':");
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews:");
        if (reviews.isEmpty()) {
            System.out.println(" There are no reviews yet.");
        } else {
            for (String review : reviews) {
                System.out.println("- " + review);
            }
        }
    }
}
