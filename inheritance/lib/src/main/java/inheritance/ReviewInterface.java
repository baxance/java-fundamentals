package inheritance;

import java.util.List;

public interface ReviewInterface {
    void addReview(String body, String author, int stars);
    void printReview(List<Review> reviewList);
}
