public class Main {
    public static int factorial(int n) {
        int res = 1;

        for (int i = 1; i <= n; i++) {
            res *= i;
        }

        return res;
    }

    public static int recursiveFactorial (int n) {  
        if (n >= 1) {
            int res = n * recursiveFactorial(n-1);
            return res;
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(4));
        System.out.println(factorial(5));

        System.out.println(recursiveFactorial(1));
        System.out.println(recursiveFactorial(2));
        System.out.println(recursiveFactorial(3));
        System.out.println(recursiveFactorial(4));
        System.out.println(recursiveFactorial(5));
    }
}