import java.util.*;
// Task 2: Find Average of an Array
// This method calculates the average of an array using recursion.
// Time Complexity: O(n), where n is the size of the array.
class FindAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Average: " + findAverage(arr, n));
        sc.close();
    }
    /**
     * Computes the average of an array using recursion.
     * @param arr Input array
     * @param n Size of the array
     * @return Average value of elements in the array
     */
    public static double findAverage(int[] arr, int n) {
        if (n == 1) return arr[0];
        return ((findAverage(arr, n - 1) * (n - 1)) + arr[n - 1]) / n;
    }
}
