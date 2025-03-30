import java.util.*;
// Task 7: Sum of Digits using Recursion
class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Sum of Digits: " + sumDigits(num));
        sc.close();
    }

    /**
     * Recursively calculates the sum of digits of a number.
     * Time Complexity: O(log n), where log(n) is the number of digits.
     */
    public static int sumDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumDigits(n / 10);
    }
}

