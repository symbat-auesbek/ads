import java.util.Scanner;

/**
 * This method checks if a given number is prime using recursion.
 * It tests divisors up to the square root of the number.
 * Time complexity: O(sqrt(n)), where n is the input number.
 */
public class Problem3 {
    public static boolean isPrime(int n, int divisor) {
        // Base case: if number is less than 2, not prime
        if (n < 2) return false;
        // Base case: if divisor exceeds square root, number is prime
        if (divisor * divisor > n) return true;
        // If divisible, not prime
        if (n % divisor == 0) return false;
        // Recursively check next divisor
        return isPrime(n, divisor + 1);
    }

    public static boolean isPrime(int n) {
        return isPrime(n, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = scanner.nextInt();
        System.out.println("Number " + n + " is " + (isPrime(n) ? "prime" : "composite"));
        scanner.close();
    }
}