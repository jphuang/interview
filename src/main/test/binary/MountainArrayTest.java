package binary;

import org.junit.jupiter.api.Test;

public class MountainArrayTest {
  @Test
  public void testPeakIndexInMountainArray() {
    MountainArray mountainArray = new MountainArray();
    int i = mountainArray.peakIndexInMountainArray(new int[] {0, 1, 0});
    assert i == 1;
  }
}
