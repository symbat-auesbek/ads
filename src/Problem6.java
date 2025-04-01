import java.util.Scanner;

/**
 * This method calculates a raised to the power of n using recursion.
 * It multiplies the base by itself n times with a base case of 0^0 = 1.
 * Time complexity: O(n), where n is the exponent.
 */
public class Problem6 {
    public static long power(int a, int n) {
        // Base case: any number to power 0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: a * a^(n-1)
        return a * power(a, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter the exponent (n): ");
        int n = scanner.nextInt();
        System.out.println(a + "^" + n + " = " + power(a, n));
        scanner.close();
    }
}
