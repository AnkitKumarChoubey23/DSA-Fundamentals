package dsa_lab_practice_package;

import java.util.*;

public class AnagramCheck {

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] freq = new int[26];

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        for (char ch : s1.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (char ch : s2.toCharArray()) {
            freq[ch - 'a']--;
        }

        for (int x : freq) {
            if (x != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        if (isAnagram(s1, s2))
            System.out.print("Yes");
        else
            System.out.print("No");

        sc.close();
    }
}
