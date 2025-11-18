package dsa_lab_practice_package;

import java.util.*;

public class BinaryNumberUsingQueue {

    // Generate binary numbers from 1 to N
    public static void generateBinary(int n) {
        Queue<String> q = new LinkedList<>();

        q.add("1");  // first binary number

        for (int i = 0; i < n; i++) {
            String s = q.poll();     // get front
            System.out.print(s + " ");  

            q.add(s + "0");          // append 0
            q.add(s + "1");          // append 1
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        generateBinary(n);

        sc.close();
    }
}
