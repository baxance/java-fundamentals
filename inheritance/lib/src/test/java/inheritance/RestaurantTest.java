package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void restaurantTest() {
        Restaurant onion = new Restaurant("potato", "testprice");
        onion.addReview("testBody", "testAuthor", 5);
        Shop shop = new Shop();
        shop.addReview("testBody", "testAuthor", 5);
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
        test.addReview("good beer, free pool", "Barrett", 5);
        test.addReview("its okay", "Laura", 4);
        test.toString();
        Restaurant test2 = new Restaurant("Shiro's", "$$$$$");
        test2.addReview("the best", "Barrett", 5);
        test2.toString();
    }
}
