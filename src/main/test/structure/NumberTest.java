package structure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberTest {

  private Number numberUnderTest;

  @BeforeEach
  void setUp() {
    numberUnderTest = new Number();
  }

  @Test
  void testSingleNumber() {
    assertEquals(0, numberUnderTest.singleNumber(new int[] {0}));
    assertEquals(1, numberUnderTest.singleNumber(new int[] {2, 2, 1}));
    assertEquals(4, numberUnderTest.singleNumber(new int[] {4, 1, 2, 1, 2}));
  }

  @Test
  void testMajorityElement() {
    assertEquals(3, numberUnderTest.majorityElement(new int[] {3, 2, 3}));
    assertEquals(2, numberUnderTest.majorityElement(new int[] {2, 2, 1}));
    assertEquals(2, numberUnderTest.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2}));
  }
}
