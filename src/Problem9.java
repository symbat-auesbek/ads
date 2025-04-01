/*
 * This program calculates the binomial coefficient C(n, k) using recursion.
 *
 * Formula: C(n, k) = C(n-1, k-1) + C(n-1, k)
 * Base cases:
 *   - C(n, 0) = 1
 *   - C(n, n) = 1
 */

import java.util.Scanner;

public class Problem9 {
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1; // Base case: C(n, 0) = C(n, n) = 1
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k); // Recursive call
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println(binomialCoefficient(n, k)); // Print C(n, k)

        scanner.close();
    }
}