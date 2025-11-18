package dsa_lab_practice_package;

import java.util.*;

public class PowerUsingRecursion {

    public static int power(int a, int b) {
        if (b == 0) return 1;        // Base case
        return a * power(a, b - 1);  // Recursive step
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(power(a, b));

        sc.close();
    }
}
