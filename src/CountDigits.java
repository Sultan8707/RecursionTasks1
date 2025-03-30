import java.util.*;
class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Number of Digits: " + countDigits(num));
        sc.close();
    }

    /**
     * Recursively counts the number of digits in a number.
     * Time Complexity: O(log n), where log(n) is the number of digits.
     */
    public static int countDigits(int n) {
        if (n == 0) return 0;
        return 1 + countDigits(n / 10);
    }
}
