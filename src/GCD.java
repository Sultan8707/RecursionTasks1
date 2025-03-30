import java.util.*;
// Task 9: Greatest Common Divisor (GCD) using Recursion
class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD: " + gcd(a, b));
        sc.close();
    }

    /**
     * Recursively finds the GCD using Euclidean algorithm.
     * Time Complexity: O(log(min(a, b))).
     */
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}