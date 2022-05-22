package structure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ColorTest {

  private Color colorUnderTest;

  @BeforeEach
  void setUp() {
    colorUnderTest = new Color();
  }

  @Test
  void testSortColors() {
    // Setup
    // Run the test
    int[] nums = {2, 0, 2, 1, 1, 0};
    colorUnderTest.sortColors(nums);
    System.out.println(Arrays.toString(nums));
    // Verify the results
  }
}
