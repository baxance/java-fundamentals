package inheritance;

import org.checkerframework.checker.units.qual.A;
import java.util.ArrayList;
import java.util.List;

public class Restaurant implements ReviewInterface {
    String name;
    double rating;
    String price;

    ArrayList<Review> reviews = new ArrayList<Review>();

    public Restaurant(String name, String price) {
        this.name = name;
        this.rating = 0;
        this.price = price;
    }

    public String toString() {
        System.out.println("===== in the toString method printing... =====");

        return String.format("%s has %.2f stars and costs %s.",
                name,
                rating,
                price);
    }

    @Override
    public void addReview(String body, String author, int stars) {
        Review test = new Review(body, author, stars);
        reviews.add(test);
        reviews.get(0).toString();
        //add a review to the arraylist
    }

    @Override
    public void printReview(List<Review> reviewList) {

    }
}
/*
Code review:
lol wat
 */
