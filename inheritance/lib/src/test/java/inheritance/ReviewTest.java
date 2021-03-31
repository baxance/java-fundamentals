package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void toStringTest() {
        Review test = new Review("ono", "Kawika", 5);
        String expected = "ono, 5 stars. From Kawika.";
        String actual = test.toString();
        assertEquals(expected, actual);
    }



}
