import java.util.Scanner;

public class Solution {
  static int power(int base, int exponent) {
    int number;

    if (exponent < 0) {
      number = 1 / power(base, -exponent);
    } else if (exponent == 0) {
      number = 1;
    } else {
      number = base * power(base, exponent - 1);
    }

    return number;
  }

  public static void main(String[] args) {
    int base;
    int exponent;

    try (Scanner scanner = new Scanner(System.in)) {
      base = scanner.nextInt();
      exponent = scanner.nextInt();
    }

    int poweredNumber = power(base, exponent);

    System.out.println(poweredNumber);
  }
}
