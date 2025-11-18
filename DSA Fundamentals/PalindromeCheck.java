package dsa_lab_practice_package;

import java.util.*;

public class PalindromeCheck {

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        if (isPalindrome(s))
            System.out.print("Yes");
        else
            System.out.print("No");

        sc.close();
    }
}
