import java.util.Scanner;

public class Solution {
  static boolean checkPalindrome(String string, int low, int high) {
    while (low < high) {
      if (string.charAt(low) != string.charAt(high)) {
        return false;
      }

      low++;
      high--;
    }

    return true;
  }

  static String longestPalindrome(String string) {
    int length = string.length();
    int start = 0, maxLength = 1;

    for (int i = 0; i < length; i++) {
      for (int j = i; j < length; j++) {
        if (checkPalindrome(string, i, j) && (j - i + 1) > maxLength) {
          start = i;
          maxLength = j - i + 1;
        }
      }
    }

    return string.substring(start, start + maxLength);
  }

  public static void main(String[] args) {
    String string;

    try (Scanner scanner = new Scanner(System.in)) {
      string = scanner.next();
    }

    String longestSubstring = longestPalindrome(string);

    System.out.println(longestSubstring);
  }
}
