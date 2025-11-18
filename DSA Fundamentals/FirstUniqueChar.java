package dsa_lab_practice_package;

import java.util.*;

public class FirstUniqueChar {

    public static char firstNonRepeating(String s) {
        int[] freq = new int[26];

        s = s.toLowerCase();

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (char ch : s.toCharArray()) {
            if (freq[ch - 'a'] == 1) {
                return ch;
            }
        }

        return '-';     // indicates no unique character
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char ans = firstNonRepeating(s);

        if (ans == '-')
            System.out.print("-1");
        else
            System.out.print(ans);

        sc.close();
    }
}
