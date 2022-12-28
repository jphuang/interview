package combination;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public  class PhoneNumberTest {

    @Test
    public void testLetterCombinations() {
        // Setup
        // Run the test
        List<String> result = new PhoneNumber().letterCombinations("23");
        // Verify the results
        assertEquals(Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf"), result);
    }
}