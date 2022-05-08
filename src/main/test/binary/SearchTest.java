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

  @Test
  public void testSearchRange() {
    Search search = new Search();
    int[] index = search.searchRange(new int[] {5, 7, 7, 8, 8, 10}, 8);
    assert index[0] == 3;
    assert index[1] == 4;
  }

  @Test
  public void testSearchRange2() {
    Search search = new Search();
    int[] index = search.searchRange(new int[] {5, 7, 7, 8, 8, 10}, 6);
    assert index[0] == -1;
    assert index[1] == -1;
  }

  @Test
  public void testSearchRange3() {
    Search search = new Search();
    int[] index = search.searchRange(new int[] {1}, 0);
    assert index[0] == -1;
    assert index[1] == -1;
  }
}
