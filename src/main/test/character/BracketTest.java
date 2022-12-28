package character;

import org.junit.Assert;
import org.junit.Test;

public class BracketTest {
    @Test
    public void testIsValid() {
        // Setup
        // Run the test
        boolean result = new Bracket().isValid("()");

        // Verify the results
        Assert.assertTrue(result);

         result = new Bracket().isValid("()[]{}");

        // Verify the results
        Assert.assertTrue(result);

        result = new Bracket().isValid("(}");

        // Verify the results
        Assert.assertFalse(result);
    }
}