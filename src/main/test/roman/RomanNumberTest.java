package roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RomanNumberTest {

    /**
     * 罗马数字转整数
     */
    @Test
    void romanToInt() {
        int i = new RomanNumber().romanToInt("MCMXCIV");
        Assertions.assertEquals(1994, i);
    }
}