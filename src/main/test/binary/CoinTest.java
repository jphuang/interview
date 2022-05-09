package binary;

import org.junit.Test;

public class CoinTest {
  @Test
  public void testArrangeCoins() {
    Coin coin = new Coin();
    int i = coin.arrangeCoins(5);
    assert i == 2;
  }

  @Test
  public void testArrangeCoins2() {
    Coin coin = new Coin();
    int i = coin.arrangeCoins(8);
    assert i == 3;
  }

  @Test
  public void testArrangeCoins3() {
    Coin coin = new Coin();
    int i = coin.arrangeCoins(1804289383);
    assert i == 60070;
  }
}
