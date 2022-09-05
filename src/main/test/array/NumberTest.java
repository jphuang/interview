package array;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberTest {

    @Test
    public void findRepeatNumber() {
        Number test = new Number();
        int[] numbers = new int[] {2, 3, 1, 0, 2, 5, 3};
        int repeatNumber = test.findRepeatNumber(numbers);
        Assert.assertEquals(2, repeatNumber);
    }

    @Test
    public void findRepeatNumber2() {
        Number test = new Number();
        int[] numbers = new int[] {2, 3, 1, 0, 2, 5, 3};
        int repeatNumber = test.findRepeatNumber2(numbers);
        Assert.assertEquals(2, repeatNumber);

        numbers = new int[] {2, 3, 1, 1, 0};
        repeatNumber = test.findRepeatNumber2(numbers);
        Assert.assertEquals(1, repeatNumber);
    }
}
