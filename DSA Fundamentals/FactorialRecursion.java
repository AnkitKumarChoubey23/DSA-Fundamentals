package dsa_lab_practice_package;

import java.util.*;

public class FactorialRecursion {

    public static int factorial(int n) {
        if (n == 0 || n == 1) 
            return 1;                 // base case
        return n * factorial(n - 1);   // recursive case
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(factorial(n));

        sc.close();
    }
}
