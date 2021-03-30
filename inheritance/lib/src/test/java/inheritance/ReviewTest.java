package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void toStringTest() {
        Review test = new Review("grinds is ono", "Keawe Malapit Okuno III", 5);
        String expected = "grinds is ono, 5 stars. From Keawe Malapit Okuno III.";
        String actual = test.toString();
        assertEquals(expected, actual);
    }



}
