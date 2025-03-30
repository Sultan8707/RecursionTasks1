import java.util.*;
// Task 3: Check if a Number is Prime
// This method checks whether a number is prime using recursion.
// Time Complexity: O(sqrt(n)), where n is the input number.
class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check prime: ");
        int num = sc.nextInt();
        System.out.println("Is Prime: " + isPrime(num, 2));
        sc.close();
    }
    /**
     * Recursively checks if a number is prime.
     * @param n Number to check
     * @param i Current divisor
     * @return True if the number is prime, false otherwise
     */
    public static boolean isPrime(int n, int i) {
        if (n <= 2) return (n == 2);
        if (n % i == 0) return false;
        if (i * i > n) return true;
        return isPrime(n, i + 1);
    }
}
