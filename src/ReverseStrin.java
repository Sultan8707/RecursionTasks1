import java.util.*;
// Task 6: Reverse a String using Recursion
class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String str = sc.next();
        System.out.println("Reversed String: " + reverse(str));
        sc.close();
    }

    /**
     * Recursive function to reverse a string.
     * @param str The input string.
     * @return The reversed string.
     */
    public static String reverse(String str) {
        if (str.isEmpty()) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
