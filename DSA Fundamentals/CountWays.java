package dsa_lab_practice_package;

import java.util.*;

public class CountWays {

    // Recursive function to count ways
    public static int countWays(int n) {
        if (n == 0) return 1;   // 1 valid way (stay there)
        if (n < 0) return 0;    // invalid path

        return countWays(n - 1) + countWays(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(countWays(n));

        sc.close();
    }
}
