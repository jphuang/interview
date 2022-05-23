package odd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SumTest {

  private Sum sumUnderTest;

  @BeforeEach
  void setUp() {
    sumUnderTest = new Sum();
  }

  @Test
  void testThreeSum() {
    assertEquals(
        Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1)),
        sumUnderTest.threeSum(new int[] {-1, 0, 1, 2, -1, -4}));
    assertEquals(Collections.emptyList(), sumUnderTest.threeSum(new int[] {0}));
  }

  @Test
  void testTwoSum() {
    assertArrayEquals(new int[] {0}, sumUnderTest.twoSum(new int[] {0}, 0));
    assertArrayEquals(new int[] {}, sumUnderTest.twoSum(new int[] {0}, 0));
  }

  @Test
  void testBinarySearch() {
    assertEquals(0, sumUnderTest.binarySearch(0, new int[] {0}, 0));
  }

  @Test
  void testTowSum() {
    assertEquals(Arrays.asList(Arrays.asList(0)), Sum.towSum(new int[] {0}, 0, 0, 0));
    assertEquals(Collections.emptyList(), Sum.towSum(new int[] {0}, 0, 0, 0));
  }
}
