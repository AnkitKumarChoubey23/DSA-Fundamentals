package dsa_lab_practice_package;

import java.util.*;

public class BinarySearch {

    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == key) {
                return mid + 1; // 1-based index
            }
            else if (arr[mid] < key) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        System.out.print(binarySearch(arr, key));

        sc.close();
    }
}
