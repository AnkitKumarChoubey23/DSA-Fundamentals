package dsa_lab_practice_package;

import java.util.*;

public class MissingNumber {

    public static int findMissing(int[] arr, int n) {
        int total = n * (n + 1) / 2;
        int sum = 0;

        for (int x : arr) {
            sum += x;
        }

        return total - sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();               // full range 1..n
        int[] arr = new int[n - 1];         // contains n-1 numbers

        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(findMissing(arr, n));

        sc.close();
    }
}
