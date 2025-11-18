package dsa_lab_practice_package;

import java.util.*;

public class CountVowels {

    public static int countVowels(String s) {
        s = s.toLowerCase();
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.print(countVowels(s));

        sc.close();
    }
}
