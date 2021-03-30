package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void restaurantTest() {

    }

    @Test
    public void toStringTest() {
        Restaurant test = new Restaurant("Nori's","$$");
        String expected = "Nori's has 5.00 stars and costs $$.";
        String actual = test.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void addReviewTest() {
        Restaurant test = new Restaurant("Parkway Tavern", "$$");
        test.addReview("good beer good food free pool", "Barrett", 5);
        test.addReview("arrived 5 minutes before close and they wouldn't serve my party of 10", "karen", 1);
        test.addReview("its okay", "Laura", 4);
        test.toString();
        Restaurant test2 = new Restaurant("Shiro's", "$$$$$");
        test2.addReview("da best", "Barrett", 5);
        test2.toString();
    }
}
