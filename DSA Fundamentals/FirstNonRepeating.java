package dsa_lab_practice_package;

import java.util.*;

public class FirstNonRepeating {

    public static void printFirstNonRepeating(String stream) {
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();

        for (char ch : stream.toCharArray()) {

            q.add(ch);
            freq[ch - 'a']++;

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.poll();
            }

            if (q.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        printFirstNonRepeating(input);

        sc.close();
    }
}
