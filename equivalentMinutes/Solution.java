import java.util.*;

public class Solution {
  static int equivalentMinutes(int minutes, int seconds) {
    int number;

    double planetSeconds = 1.0 * minutes * seconds;
    number = (int) Math.ceil(planetSeconds / 60);

    return number;
  }

  public static void main(String[] args) {
    int minutes;
    int seconds;

    try (Scanner scanner = new Scanner(System.in)) {
      minutes = scanner.nextInt();
      seconds = scanner.nextInt();
    }

    int equivalentMinutes = equivalentMinutes(minutes, seconds);

    System.out.println(equivalentMinutes);
  }
}