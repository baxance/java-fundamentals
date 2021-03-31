package inheritance;

public class Review {
    String body;
    String author;
    int stars;


    public Review(String body, String author, int stars){
        this.body = body;
        this.author = author;
        this.stars = stars;

    }

    public String toString() {
        System.out.println("===== In the toString method for the Review class printing... =====");
        return String.format("%s, %s stars. From %s.", body, stars, author);
    }
}
