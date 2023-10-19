import java.util.Stack;

public class ParenthesesChecker {

    static Boolean checkParentheses(String str) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '('
                    || str.charAt(i) == '{'
                    || str.charAt(i) == '[') {
                st.push(str.charAt(i));
            } else if (!st.empty() && ((str.charAt(i) == ']' && st.peek() == '[')
                    || (str.charAt(i) == '}' && st.peek() == '{')
                    || (str.charAt(i) == ')' && st.peek() == '('))) {
                st.pop();
            } else {
                st.push(str.charAt(i));
            }
        }

        if (st.empty()) {
            return true;
        }

        return false;
    }

    static void printValidity(String str) {
        if (str.isEmpty()) {
            System.err.println("String is empty");
        } else if (checkParentheses(str)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        String str = "{[()]";
        printValidity(str);
    }
}