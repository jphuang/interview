package dynamic;

import org.junit.jupiter.api.Test;

public class FibonacciNumberTest {
  @Test
  public void testFib() {
    int fib = FibonacciNumber.fib(2);
    assert fib == 1;

    fib = FibonacciNumber.fib(0);
    assert fib == 0;
  }

  @Test
  public void testFib2() {
    int fib = FibonacciNumber.fib2(2);
    assert fib == 1;

    fib = FibonacciNumber.fib2(0);
    assert fib == 0;
  }

  @Test
  public void testFib3() {
    int fib = FibonacciNumber.fib3(2);
    assert fib == 1;

    fib = FibonacciNumber.fib3(0);
    assert fib == 0;
  }
}
