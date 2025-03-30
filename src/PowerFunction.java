import java.util.*;
// Task 8: Power Function using Recursion
class PowerFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int exp = sc.nextInt();
        System.out.println("Result: " + power(base, exp));
        sc.close();
    }

    /**
     * Recursively calculates the power of a number.
     * Time Complexity: O(n), where n is the exponent.
     */
    public static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }
}

