package dsa_lab_practice_package;

import java.util.*;

class ArrayRotator {

    // Reverse elements between indices start and end
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Rotate array to the right by k positions
    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  // handles k > n

        // Step 1: reverse whole array
        reverse(arr, 0, n - 1);

        // Step 2: reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 3: reverse remaining (n-k) elements
        reverse(arr, k, n - 1);
    }
}

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        ArrayRotator.rotateRight(arr, k);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
