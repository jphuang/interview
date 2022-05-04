package binary;

import org.junit.jupiter.api.Test;

public class SearchTest {
  @Test
  public void testSearch() {
    Search search = new Search();
    int index = search.search(new int[] {-1, 0, 3, 5, 9, 12}, 9);
    System.out.println(index);
    assert index == 4;
  }

  @Test
  public void testSearch2() {
    Search search = new Search();
    int index = search.search(new int[] {2}, 2);
    System.out.println(index);
    assert index == 0;
  }
}
