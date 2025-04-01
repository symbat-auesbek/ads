import java.util.Scanner;

/**
 * This method calculates the factorial of a given number using recursion.
 * It uses the formula n! = n * (n-1)! with base cases 0! = 1 and 1! = 1.
 * Time complexity: O(n), where n is the input number.
 */
public class Problem4 {
    public static long factorial(int n) {
        // Base cases: 0! and 1! are 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n * (n-1)!
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial: ");
        int n = scanner.nextInt();
        System.out.println("Factorial of " + n + " = " + factorial(n));
        scanner.close();
    }
}
