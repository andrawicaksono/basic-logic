public class Palindrome {
    public static boolean isPalindrome(String string) {
        int i = 0;
        int j = string.length() - 1;

        while (i <= j) {
            if (string.charAt(i) != string.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static boolean isPalindromeRecursive(String string, int i) {
        if (i < string.length() / 2) {
            int j = string.length() - i - 1;

            if (string.charAt(i) != string.charAt(j)) {
                return false;
            }

            return isPalindromeRecursive(string, i + 1);
        }

        return true;
    }

    public static void printPalindrome(String string) {
        if (isPalindrome(string)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {
        printPalindrome("racecar");
        printPalindrome("abba");
        printPalindrome("kodok");

        printPalindrome("null");
        printPalindrome("palindrome");
        printPalindrome("acacacac");
    }
}