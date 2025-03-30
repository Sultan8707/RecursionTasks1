import java.util.*;

// Task 1: Find Minimum in an Array using recursion
// This method finds the minimum value in an array using recursion.
// Time Complexity: O(n), where n is the size of the array.
class FindMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Minimum: " + findMin(arr, n));
        sc.close();
    }
    /**
     * Recursively finds the minimum element in the array.
     * @param arr Input array
     * @param n Size of the array
     * @return Minimum value in the array
     */
    public static int findMin(int[] arr, int n) {
        if (n == 1) return arr[0];
        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }
}

