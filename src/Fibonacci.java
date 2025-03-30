import java.util.*;
// Task 5: Calculate Fibonacci number recursively
class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find Fibonacci: ");
        int num = sc.nextInt();
        System.out.println("Fibonacci: " + fibonacci(num));
        sc.close();
    }

    /**
     * Recursive function to calculate the nth Fibonacci number.
     * @param n The position in the Fibonacci sequence.
     * @return The nth Fibonacci number.
     */
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

