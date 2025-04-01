import java.util.Scanner;

/**
 * This method checks if a given string consists entirely of digit characters.
 * It uses recursion to verify each character.
 * Time complexity: O(n), where n is the length of the string.
 */
public class Problem8{
    public static boolean isAllDigits(String s, int index) {
        // Base case: reached end of string
        if (index == s.length()) {
            return true;
        }
        // If current character is not a digit, return false
        if (!Character.isDigit(s.charAt(index))) {
            return false;
        }
        // Recursively check next character
        return isAllDigits(s, index + 1);
    }

    public static boolean isAllDigits(String s) {
        return isAllDigits(s, 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String s = scanner.nextLine();
        System.out.println("String contains only digits: " + isAllDigits(s));
        scanner.close();
    }
}