package dsa_lab_practice_package;

import java.util.*;

public class SumOfDigitsUsingRecursion {

    public static int sumOfDigits(int n) {
        if (n == 0)
            return 0;

        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(sumOfDigits(n));

        sc.close();
    }
}
