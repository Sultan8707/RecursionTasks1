import java.util.*;
// Task 4: Calculate Factorial recursively
// Time Complexity: O(n), where n is the input number.
class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial: ");
        int num = sc.nextInt();
        System.out.println("Factorial: " + factorial(num));
        sc.close();
    }
    /**
     * Calculates the factorial of a number using recursion.
     * @param n Input number
     * @return Factorial of the number
     */
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}