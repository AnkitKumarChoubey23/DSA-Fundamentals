package dsa_lab_practice_package;

import java.util.*;

public class JumpSearch {

    public static int jumpSearch(int[] arr, int key) {

        int n = arr.length;
        int step = (int)Math.sqrt(n);   // optimal block size
        int prev = 0;

        // Find the block where element may be present
        while (arr[Math.min(step, n) - 1] < key) {
            prev = step;
            step += (int)Math.sqrt(n);

            if (prev >= n) return -1;   // not found
        }

        // Linear search inside the block
        while (prev < n && arr[prev] < key) {
            prev++;
        }

        if (prev < n && arr[prev] == key) return prev;

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        System.out.print(jumpSearch(arr, key));

        sc.close();
    }
}
