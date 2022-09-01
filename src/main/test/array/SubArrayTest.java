package array;

import org.junit.Test;

public class SubArrayTest {

    @Test
    public void minSubArrayLen() {
        SubArray subArray = new SubArray();
        int i = subArray.minSubArrayLen(7, new int[] {2, 3, 1, 2, 4, 3});
        assert i == 2;

        i = subArray.minSubArrayLen(4, new int[] {1, 4, 4});
        assert i == 1;

        i = subArray.minSubArrayLen(11, new int[] {1, 1, 1, 1, 1, 1, 1, 1});
        assert i == 0;
    }
}
