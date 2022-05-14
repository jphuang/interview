package odd;

import org.junit.jupiter.api.Test;

public class IntersectionTest {
  @Test
  public void testIntersect() {
    int[] intersect = new Intersection().intersect(new int[] {1, 2, 2, 1}, new int[] {2, 2});
    assert intersect[0] == 2;
    assert intersect[1] == 2;
  }
}
