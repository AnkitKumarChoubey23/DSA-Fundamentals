package dsa_lab_practice_package;

import java.util.*;

public class LongestCommonPrefix {

    public static String lcp(String[] arr) {
        if (arr.length == 0) return "";

        String prefix = arr[0];

        for (int i = 1; i < arr.length; i++) {
            while (!arr[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        // Clean input like ['flower','flow','flight']
        line = line.replace("[", "")
                   .replace("]", "")
                   .replace("'", "")
                   .replace(",", " ")
                   .trim();

        String[] arr = line.split("\\s+");

        System.out.print(lcp(arr));

        sc.close();
    }
}

