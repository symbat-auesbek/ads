import java.util.Scanner;

/**
 * This method calculates the n-th number in the Fibonacci sequence using recursion.
 * It uses F(n) = F(n-1) + F(n-2) with base cases F(0) = 0 and F(1) = 1.
 * Time complexity: O(2^n), where n is the input number.
 */
public class Problem5 {
    public static int fibonacci(int n) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;
        // Recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position in Fibonacci sequence: ");
        int n = scanner.nextInt();
        System.out.println("F(" + n + ") = " + fibonacci(n));
        scanner.close();
    }
}