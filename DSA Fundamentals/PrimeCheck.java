package dsa_lab_practice_package;
import java.util.*;

public class PrimeCheck {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;     // not prime
        if (n <= 3) return true;      // 2 and 3 are prime

        // Check divisors up to √n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (isPrime(n))
            System.out.print("Yes");
        else
            System.out.print("No");

        sc.close();
    }
}
