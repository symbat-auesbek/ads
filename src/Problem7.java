import java.util.Scanner;

/**
 * This method reverses the order of elements in an array and returns them as a string.
 * It uses recursion without additional data structures.
 * Time complexity: O(n), where n is the length of the array.
 */
public class Problem7 {
    public static String reverseArray(int[] arr, int index) {
        // Base case: if index is negative, return empty string
        if (index < 0) {
            return "";
        }
        // Recursive case: build string from last to first element
        return arr[index] + reverseArray(arr, index - 1);
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
        System.out.println("Array in reverse order: " + reverseArray(arr, n - 1));
        scanner.close();
    }
}
