/*
 * This program finds the min number in a given array.
 *
 * 1. Reads an integer n, which represents the number of elements.
 * 2. Takes n integers as input and stores them in an array.
 * 3. Calls the findMin function to determine the smallest number.
 * 4. Prints the result.
 */

import java.util.Scanner;

public class Problem1 {
    public static int findMin(int[] arr) {
        int min = arr[0]; // Initialize min with the first element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update min if a smaller number is found
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println(findMin(numbers)); // Print the min value

    }
}