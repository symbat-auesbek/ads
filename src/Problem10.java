import java.util.Scanner;

/**
 * This method calculates the Greatest Common Divisor (GCD) of two numbers using recursion.
 * It implements the Euclidean algorithm where GCD(a,b) = GCD(b, a%b).
 * Time complexity: O(log(min(a,b))), where a and b are the input numbers.
 */
public class Problem10 {
    public static int gcd(int a, int b) {
        // Base case: if b is 0, return a
        if (b == 0) {
            return a;
        }
        // Recursive case: GCD(b, a mod b)
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number (b): ");
        int b = scanner.nextInt();
        System.out.println("GCD(" + a + "," + b + ") = " + gcd(a, b));
        scanner.close();
    }
}