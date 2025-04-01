import java.util.Scanner;

/**
 * This method calculates the average value of a given array of integers using recursion.
 * It sums elements recursively and divides by the count.
 * Time complexity: O(n), where n is the length of the array.
 * @return The average value of the array elements.
 */
public class Problem2 {
    public static double findAverage(int[] arr, int n) {
        // Base case: if no elements, return 0
        if (n == 0) {
            return 0;
        }
        // Recursively compute weighted average
        return (arr[n - 1] + (n - 1) * findAverage(arr, n - 1)) / n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Average value: " + findAverage(arr, n));
        scanner.close();
    }
}