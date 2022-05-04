package binary;

public class GuessGame {
  // * Forward declaration of guess API.
  // * @param  num   your guess
  // * @return 	     -1 if num is lower than the guess number
  // *			      1 if num is higher than the guess number
  // *               otherwise return 0
  int n;

  public GuessGame(int n) {
    this.n = n;
  }

  int guess(int num) {
    return Integer.compare(n, num);
  }
}
