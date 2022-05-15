package binary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchTest {

  private Search searchUnderTest;

  @BeforeEach
  void setUp() {
    searchUnderTest = new Search();
  }

  @Test
  void testSearch() {
    assertEquals(0, searchUnderTest.search(new int[] {0}, 0));
  }

  @Test
  void testSearchRange() {
    assertArrayEquals(new int[] {0}, searchUnderTest.searchRange(new int[] {0}, 0));
    assertArrayEquals(new int[] {}, searchUnderTest.searchRange(new int[] {0}, 0));
  }

  @Test
  void testBinarySearch() {
    assertEquals(0, searchUnderTest.binarySearch(new int[] {0}, 0, false));
  }

  @Test
  void testSearchRotateSortArray() {
    assertEquals(0, searchUnderTest.searchRotateSortArray(new int[] {0}, 0));
  }

  @Test
  void testFindMin() {
    assertEquals(1, searchUnderTest.findMin(new int[] {3, 4, 5, 1, 2}));
  }
}
